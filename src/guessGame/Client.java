package guessGame;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.UnknownHostException;
import java.util.LinkedList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import org.eclipse.jetty.client.HttpClient;
import org.eclipse.jetty.client.api.ContentResponse;

public class Client extends JFrame {

	private ObjectInputStream in;
	private ObjectOutputStream out;
	private final JPanel upperPanel;
	private final JPanel lowerPanel;
	private JButton button;

	public Client(JPanel upperPanel, JPanel lowerPanel) throws Exception {

		this.setTitle("Client Game");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setSize(800, 600);

		this.upperPanel = upperPanel;
		this.upperPanel.setPreferredSize(new Dimension(800, 600));
		this.add(upperPanel, BorderLayout.NORTH);

		this.lowerPanel = lowerPanel;
		lowerPanel.setPreferredSize(new Dimension(800, 100));
		this.add(lowerPanel, BorderLayout.SOUTH);
		System.out.println("works? ");
		this.setVisible(true);
		HttpClient client = new HttpClient();
		client.start();

		ContentResponse res = client.GET("http://localhost:8080");
		System.out.println(res.getRequest().getAttributes());
		System.out.println(res.getRequest().getAttributes());
		Object m = res.getHeaders();
		Object obj = null;
		ByteArrayInputStream bis = null;
		ObjectInputStream ois = null;
		bis = new ByteArrayInputStream(res.getContent());
		ois = new ObjectInputStream(bis);
		obj = ois.readObject();
		LinkedList<String> g = (LinkedList<String>) obj;
		System.out.println(g.toString());

		/*
		 * try { socket = new Socket("localhost", 8080);
		 * System.out.println("Connection Established"); in = new
		 * ObjectInputStream(socket.getInputStream());
		 * System.out.println("reached");
		 * 
		 * lowerPanel = (JPanel) in.readObject(); this.add(lowerPanel,
		 * BorderLayout.SOUTH); this.repaint();
		 * 
		 * JOptionPane.showMessageDialog(null, lowerPanel != null);
		 * System.out.println("boo");
		 * 
		 * } catch (final IOException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); }
		 */

	}

	public static void main(String[] main) throws UnknownHostException,
			IOException, ClassNotFoundException {

		try {
			final TaskFactory task = new TaskFactory();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}

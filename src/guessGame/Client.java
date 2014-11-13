package guessGame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Client extends JFrame {

	private ObjectInputStream in;
	private ObjectOutputStream out;
	private JPanel upperPanel;
	private JPanel lowerPanel;
	private JButton button;

	public Client() throws ClassNotFoundException {

		this.setTitle("Client Game");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setSize(800, 600);

		lowerPanel = new JPanel();
		button = new JButton("button");
		lowerPanel.setBackground(Color.red);
		lowerPanel.setPreferredSize(new Dimension(200, 200));
		this.add(lowerPanel, BorderLayout.SOUTH);

		this.setVisible(true);
		Socket socket;
		try {
			socket = new Socket("localhost", 8080);
			System.out.println("Connection Established");
			in = new ObjectInputStream(socket.getInputStream());
			System.out.println("reached");

			upperPanel = (JPanel) in.readObject();
			this.add(upperPanel, BorderLayout.CENTER);
			this.repaint();

			JOptionPane.showMessageDialog(null, upperPanel != null);
			System.out.println("boo");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void main(String[] main) throws UnknownHostException, IOException, ClassNotFoundException {
		new Client();
	}
}

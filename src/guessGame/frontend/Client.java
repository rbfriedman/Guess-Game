package guessGame.frontend;

import guessGame.Task;
import guessGame.paint.message.ClearMessage;
import guessGame.paint.message.PaintMessage;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.UnknownHostException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import org.eclipse.jetty.client.HttpClient;
import org.eclipse.jetty.client.api.ContentResponse;
import org.eclipse.jetty.client.api.Request;
import org.eclipse.jetty.http.HttpField;
import org.eclipse.jetty.http.HttpFields;


public class Client extends JFrame {

	private static final long serialVersionUID = -6463718980738496419L;
	private ObjectInputStream in;
	private ObjectOutputStream out;
	private JPanel upperPanel;
	private LowerPanel lowerPanel;
	private JButton nextButton;
	private HttpClient client;
	private TaskTypeCardLayout ttCardLayout;

	public Client() throws Exception {

		this.setTitle("Client Game");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setSize(800, 600);

		this.upperPanel = new JPanel();
		
		this.lowerPanel = new LowerPanel();
		this.nextButton = new JButton("Next");
		this.nextButton.addActionListener(new NextTaskListener());
		lowerPanel.add(nextButton, BorderLayout.WEST);
		this.upperPanel.setPreferredSize(new Dimension(600, 600));
		lowerPanel.setPreferredSize(new Dimension(600, 100));
		ttCardLayout = new TaskTypeCardLayout(this.lowerPanel);
		this.upperPanel.setLayout(ttCardLayout);
		this.add(upperPanel, BorderLayout.NORTH);
		this.add(lowerPanel, BorderLayout.SOUTH);
		
		System.out.println("works? ");
		this.setVisible(true);
		client = new HttpClient();
		client.start();

		readInTask(client);

	
	}

	private void readInTask(HttpClient client) throws InterruptedException, ExecutionException, TimeoutException {
		//this.upperPanel.repaint(new ClearMessage());

		//Request req = client.POST("http://localhost:8080/?user=rfriedman");
		ContentResponse res = client.GET("http://localhost:8080/?user=rfriedman");
		HttpFields headers =  res.getHeaders();
		Iterator<HttpField> iter = headers.iterator();
		while(iter.hasNext()){
			System.out.println(iter.next());
		}
		System.out.println(res.getRequest().getAttributes());
		System.out.println(res.getRequest().getAttributes());
		Object m = res.getHeaders();
		Object obj = null;
		
		try {
			ObjectInputStream inStream = new ObjectInputStream(
					new ByteArrayInputStream(res.getContent()));
			obj = inStream.readObject();

			addTask(obj, headers.getField("Content-Type"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
	}

	private void addPaintTask(Object obj) {
		//this.upperPanel.removeAll();
		
		this.repaint();
	}
	

	private void addTask(Object obj, HttpField header) {
		// TODO Auto-generated method stub
		this.upperPanel.removeAll();
		ttCardLayout.show(upperPanel, obj,header.getValue());
		upperPanel.repaint();
		this.repaint();

	}
	
	private class NextTaskListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			try {
				readInTask(client);
			} catch (InterruptedException | ExecutionException
					| TimeoutException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
	}

	public static void main(String[] main) throws UnknownHostException,
			IOException, ClassNotFoundException {

		try {
			new Client();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

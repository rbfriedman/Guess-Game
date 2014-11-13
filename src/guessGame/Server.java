package guessGame;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Server extends JFrame {

	private JPanel upperPanel;
	private JPanel lowerPanel;
	private JButton upperButton;
	private JButton lowerButton;

	public Server() throws IOException {

		this.setSize(800, 600);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setTitle("Game Server");
		this.upperPanel = new JPanel();
		this.lowerPanel = new JPanel();

		this.upperButton = new JButton("upper");
		this.lowerButton = new JButton("lower");
		this.upperPanel.add(upperButton);
		this.lowerPanel.add(lowerButton);

		ServerSocket serverSocket = new ServerSocket(8080);
		Socket socket = null;

		this.setVisible(true);

		socket = serverSocket.accept();

		// ObjectInputStream in = new
		// ObjectInputStream(socket.getInputStream());
		ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());

		out.writeObject(upperPanel);

		String hello = "Hello";

		System.out.println(hello);

	}

	public static void main(String[] args) throws IOException {
		new Server();
	}

}

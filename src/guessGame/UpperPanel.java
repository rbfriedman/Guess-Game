package guessGame;

<<<<<<< HEAD
import guessGame.paint.message.ClearMessage;
=======
>>>>>>> 27ce45885af938b82b459939d4893f5d7dbc0666
import guessGame.paint.message.PaintMessage;

import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class UpperPanel extends JPanel {

<<<<<<< HEAD
	/**
	 * 
	 */
	private static final long serialVersionUID = 2646018017326072535L;
	private final String answer = "rectangle";
	private PaintMessage pm = new ClearMessage();

	@Override
	protected void paintComponent(Graphics g) {
		this.pm.apply((Graphics2D) g);
		System.out.println(pm.toString());
		
	}
	
	public void repaint(PaintMessage pm){
		this.pm  = pm;
=======
	// private final String answer = "rectangle";
	// private PaintMessage pm = new ClearMessage();

	private final Challenge challenge;

	public UpperPanel(Challenge challenge) {
		this.challenge = challenge;
	}

	@Override
	protected void paintComponent(Graphics g) {
		this.add(challenge);

		this.pm.apply((Graphics2D) g);
		System.out.println(pm.toString());

	}

	public void repaint(PaintMessage pm) {
		this.pm = pm;
>>>>>>> 27ce45885af938b82b459939d4893f5d7dbc0666
		repaint();
	}

	/*
	 * public boolean getAnswer(String answer) {
	 * 
	 * if (this.answer.equals(answer)) { return true; } else { return false; } }
	 */

	public String getAnswer() {
		return answer;
	}
<<<<<<< HEAD
	
	
=======
>>>>>>> 27ce45885af938b82b459939d4893f5d7dbc0666

}
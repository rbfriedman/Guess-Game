package guessGame;

import guessGame.paint.message.PaintMessage;

import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class UpperPanel extends JPanel {

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

}
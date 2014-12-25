package guessGame;

import guessGame.paint.message.LineMessage;
import guessGame.paint.message.PaintMessage;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;

public class UpperPanel_2 extends UpperPanel {

	private final String answer = "oval";

	@Override
	protected void paintComponent(Graphics g) {
		g.drawOval(20, 20, 100, 100);
	}

	@Override
	public String getAnswer() {
		return answer;
	}

	@Override
	public PaintMessage getMessage() {
		// TODO Auto-generated method stub
		return new LineMessage(0, 200, 200, 400, Color.BLACK.getRGB(), 30);
	}

	/*
	 * public boolean getAnswer(String answer) {
	 * 
	 * if (this.answer.equals(answer)) { return true; } else { return false; } }
	 */

}

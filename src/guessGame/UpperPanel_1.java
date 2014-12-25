package guessGame;

import guessGame.paint.message.LineMessage;
import guessGame.paint.message.PaintMessage;

import java.awt.Color;
import java.awt.Graphics;

public class UpperPanel_1 extends UpperPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2646018017326072535L;
	private final String answer = "rectangle";

	@Override
	protected void paintComponent(Graphics g) {
		g.drawRect(20, 20, 100, 100);
	}

	/*
	 * public boolean getAnswer(String answer) {
	 * 
	 * if (this.answer.equals(answer)) { return true; } else { return false; } }
	 */

	@Override
	public String getAnswer() {
		return answer;
	}
	
	@Override
	public PaintMessage getMessage() {
		// TODO Auto-generated method stub
		return new LineMessage(0, 200, 200, 400, Color.BLACK.getRGB(), 30);
	}

}
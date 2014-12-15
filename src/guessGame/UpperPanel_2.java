package guessGame;

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

	/*
	 * public boolean getAnswer(String answer) {
	 * 
	 * if (this.answer.equals(answer)) { return true; } else { return false; } }
	 */

}

package guessGame;

import guessGame.paint.message.PaintMessage;

import javax.swing.JPanel;

public abstract class UpperPanel extends JPanel {

	public abstract String getAnswer();
	public abstract PaintMessage getMessage();
}

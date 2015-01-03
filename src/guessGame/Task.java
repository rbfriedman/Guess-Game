package guessGame;

import javax.swing.JPanel;

public class Task {

	private final JPanel upperPanel;
	private final JPanel lowerPanel;

	public Task(JPanel upperPanel, JPanel lowerPanel) throws ClassNotFoundException {

		this.upperPanel = upperPanel;
		this.lowerPanel = lowerPanel;
		final String answer = ((UpperPanel) upperPanel).getAnswer();
		((LowerPanel_1) this.lowerPanel).setAnswer(answer);

		new Client(upperPanel, lowerPanel);
	}

	public boolean isCorrect() {
		return false;

	}

	public JPanel getUpperPanel() {
		return upperPanel;
	}

	public JPanel getLowerPanel() {
		return lowerPanel;
	}

}

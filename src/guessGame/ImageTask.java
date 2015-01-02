package guessGame;

import javax.swing.ImageIcon;

public class ImageTask implements Challenge {

	private final ImageIcon image;
	private final String answer;

	public ImageTask(String link, String answer) {
		this.image = new ImageIcon(link);
		this.answer = answer;
	}

	@Override
	public Object getChallenge() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getAnswer() {
		// TODO Auto-generated method stub
		return null;
	}

}

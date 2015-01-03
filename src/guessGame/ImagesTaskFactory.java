package guessGame;

public class ImagesTaskFactory extends TaskFactory {

	private TaskFactoryType type;

	public ImagesTaskFactory() {
		super();

		challenges.add(new ImageTask("https://farm8.staticflickr.com/7572/15491044323_99a2255bba_m.jpg", "Bullfinch"));

	}
}

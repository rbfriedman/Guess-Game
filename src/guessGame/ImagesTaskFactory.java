package guessGame;

import guessGame.ImageTask;
import guessGame.Task;
import guessGame.TaskFactory;
import guessGame.TaskFactoryType;

public class ImagesTaskFactory extends TaskFactory {

	private TaskFactoryType type;

	public ImagesTaskFactory() {
		super();

		challenges.add(new Task(new ImageTask("https://farm8.staticflickr.com/7572/15491044323_99a2255bba_m.jpg", "Bullfinch")));

	}
}

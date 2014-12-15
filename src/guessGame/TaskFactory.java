package guessGame;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.JPanel;

public class TaskFactory {

	/*
	 * this class has 2 arraylists that are composed out off panels for top and
	 * bottom. this class is responsible for picking out the panels and creating
	 * a task out of them
	 */
	final private Task task;
	private final List<JPanel> upperPanels;
	private final List<JPanel> lowerPanels;

	public TaskFactory() throws ClassNotFoundException {
		/*
		 * create a function that will go through the folder to pick all the
		 * panels by name
		 * 
		 * //this.upperPanel = upperPanels.get(r.nextInt(upperPanels.size()));
		 * //this.lowerPanel = lowerPanels.get(r.nextInt(lowerPanels.size()));
		 */

		this.upperPanels = new ArrayList<JPanel>();
		this.lowerPanels = new ArrayList<JPanel>();

		// upperPanels = getAllFileNames();
		final Random r = new Random();
		this.upperPanels.add(new UpperPanel_1());
		this.upperPanels.add(new UpperPanel_2());

		this.lowerPanels.add(new LowerPanel_1());

		final JPanel upperPanel = upperPanels.get(r.nextInt(upperPanels.size()));
		final JPanel lowerPanel = lowerPanels.get(r.nextInt(lowerPanels.size()));

		this.task = new Task(upperPanel, lowerPanel);

		// upperPanels.add(this.upperPanel);
		// lowerPanels.add(this.lowerPanel);

		//

	}

	public Task getTask() {
		return task;
	}

	public List<JPanel> getUpperPanels() {
		return upperPanels;
	}

	public List<JPanel> getLowerPanels() {
		return lowerPanels;
	}

}

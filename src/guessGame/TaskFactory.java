package guessGame;

import guessGame.paint.message.LineMessage;

import java.awt.Color;
import java.io.IOException;
import java.net.UnknownHostException;
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
	private final List<Task> challenges;

	public TaskFactory()  {
		/*
		 * create a function that will go through the folder to pick all the
		 * panels by name
		 * 
		 * //this.upperPanel = upperPanelSs.get(r.nextInt(upperPanels.size()));
		 * //this.lowerPanel = lowerPanels.get(r.nextInt(lowerPanels.size()));
		 */

		challenges = new ArrayList<Task>();
		challenges.add(new Task(new LineMessage(0, 200, 200, 400, Color.BLACK.getRGB(), 30),"line"));
		challenges.add(new Task(new LineMessage(50, 200, 100, 400, Color.BLACK.getRGB(), 10),"line"));
		// upperPanels = getAllFileNames();
		

		// upperPanels.add(this.upperPanel);
		// lowerPanels.add(this.lowerPanel);

		//

	}

	public Task getTask() {
		return challenges.get(0);
	}


}

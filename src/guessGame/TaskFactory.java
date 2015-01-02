package guessGame;

import guessGame.paint.message.LineMessage;
import guessGame.paint.message.PaintType;
import guessGame.paint.message.ShapeMessage;

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
	private Task task;
	private List<Task> challenges;
	private int currentIndex = 0;
	private TaskFactoryType tfType;

	public TaskFactory()  {
		/*
		 * create a function that will go through the folder to pick all the
		 * panels by name
		 * 
		 * //this.upperPanel = upperPanelSs.get(r.nextInt(upperPanels.size()));
		 * //this.lowerPanel = lowerPanels.get(r.nextInt(lowerPanels.size()));
		 */

		challenges = new ArrayList<Task>();
		challenges.add(new Task(new LineMessage(0, 100, 200, 300, Color.BLACK.getRGB(), 30),"line"));
		challenges.add(new Task(new LineMessage(50, 100, 100, 300, Color.BLACK.getRGB(), 10),"line"));
		challenges.add(new Task(new ShapeMessage(PaintType.RECTANGLE,100, 100, 100, 200, Color.BLACK.getRGB(), 10,true),"rectangle"));
		challenges.add(new Task(new ShapeMessage(PaintType.OVAL,100, 100, 100, 200, Color.BLACK.getRGB(), 10,false),"oval"));
		// upperPanels = getAllFileNames();
		

		// upperPanels.add(this.upperPanel);
		// lowerPanels.add(this.lowerPanel);

		//

	}

	public Task getTask() {
		currentIndex = (currentIndex+1)%challenges.size();
		return challenges.get(currentIndex);
	}
	
	public Task getRandomTask(){
		int index = (int)(Math.random() * challenges.size() + 1);
		return challenges.get(index);
	}

	public TaskFactoryType getContentType() {
		// TODO Auto-generated method stub
		return tfType;
	}
	
	


}

package guessGame.frontend;

import guessGame.paint.message.ClearMessage;
import guessGame.paint.message.PaintMessage;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LayoutManager;

import javax.swing.JPanel;

public class UpperPanel extends JPanel implements TaskGenerator{

	protected LowerPanel lowerPanel;
	

	public UpperPanel(LowerPanel lowerPanel) {
		// lowerPanel content is determined by upper panel
		this.lowerPanel = lowerPanel;
		setPreferredSize(new Dimension(500, 400));
	}

	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		System.out.println("Paintng...");
	}

	@Override
	public void addTaskContent(Object content) {
		// TODO Auto-generated method stub
		
	}

	public void setTaskSolution() {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void setTaskSolution(String solution) {
		lowerPanel.setAnswer(solution);
		
	}

}

package guessGame;

import java.io.Serializable;

import guessGame.paint.message.PaintMessage;


public class Task implements Challenge, Serializable{

	private PaintMessage challenge;
	private String answer;
	private TaskFactoryType tfType;

	public Task(TaskFactoryType tfType, PaintMessage challenge, String answer)  {
		this.tfType = tfType;
		this.challenge = challenge;
		this.answer = answer;
		
	}

	public boolean isCorrect() {
		return false;

	}

	@Override
	public Object getChallenge() {
		// TODO Auto-generated method stub
		return challenge;
	}

	@Override
	public String getAnswer() {
		// TODO Auto-generated method stub
		return answer;
	}


	@Override
	public TaskFactoryType getTFType() {
		// TODO Auto-generated method stub
		return tfType;
	}

}

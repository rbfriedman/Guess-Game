package guessGame;


public class Task implements Challenge{

	private Object challenge;
	private String answer;

	public Task(Object challenge, String answer)  {

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



}

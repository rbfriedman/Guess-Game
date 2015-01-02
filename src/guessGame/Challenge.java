package guessGame;

public interface Challenge {

	private TaskFactoryType type;

	public Object getChallenge();

	public String getAnswer();
}

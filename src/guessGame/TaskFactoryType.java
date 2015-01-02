package guessGame;

public enum TaskFactoryType {
	BINARY("application/octet-stream"), JPEG("image/jpeg");
	public String decsription;
	TaskFactoryType(String description){
		this.decsription = description;
	}
}

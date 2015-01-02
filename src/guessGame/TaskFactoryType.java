package guessGame;

public enum TaskFactoryType {
	BINARY("application/octet-stream"), JPEG("image/jpeg"), GIF("image/gif"), TEXT("text/plain");
	;
	public String decsription;
	/*
	 * Taken form http://www.freeformatter.com/mime-types-list.html
	 */

	public String description;

	TaskFactoryType(String description) {
		this.decsription = description;
		this.description = description;
	}

	@Override
	public String toString() {
		return description;
	}
}
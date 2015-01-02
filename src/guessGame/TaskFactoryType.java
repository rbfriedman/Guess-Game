package guessGame;

public enum TaskFactoryType {
	/*Taken form 
	 * http://www.freeformatter.com/mime-types-list.html
	 */
	BINARY("application/octet-stream"), JPEG("image/jpeg"), GIF("image/gif"),TEXT("text/plain");
	public String description;
	TaskFactoryType(String description){
		this.description = description;
	}
	@Override
	public String toString(){
		return description;
	}
}

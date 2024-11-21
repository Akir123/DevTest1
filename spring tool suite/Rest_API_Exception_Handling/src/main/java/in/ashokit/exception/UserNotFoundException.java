package in.ashokit.exception;

public class UserNotFoundException extends RuntimeException {
	
	private static final long aerialVersionUID = 347586964325L;
	
public UserNotFoundException() {
	
}
public UserNotFoundException(String msg) {
	super(msg);
}
}

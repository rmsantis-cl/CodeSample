package graph;

/**
 * Exception during a graph operation.
 * 
 * @since 1.0
 * @author rsant
 *
 */
public class GraphException  extends Exception{
	
	private static final String defaultMessage = "Graph package exception";

	/**
	 * New exception with the default message and current stack
	 */
	public GraphException() {
		super(defaultMessage);
	}
	/**
	 * Exception for the current stack
	 * @param msg Exception message 
	 */
	public GraphException(String msg) {
		super(msg);
	}
    /**
     * Exception for the given message and cause
     * 
     * @param message exception message
     * @param cause exception cause 
     */
    public GraphException(String message, Throwable cause) {
        super(message, cause);
    }
    /**
     * Exception with default message for the given cause
     * @param cause exception given cause
     */
    public GraphException(Throwable cause) {
        super(defaultMessage,cause);
    }
}

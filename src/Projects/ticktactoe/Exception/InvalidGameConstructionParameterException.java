package Projects.ticktactoe.Exception;

public class InvalidGameConstructionParameterException extends Exception {
    public InvalidGameConstructionParameterException() {
        super();
    }

    public InvalidGameConstructionParameterException(String message) {
        super(message);
    }

    public InvalidGameConstructionParameterException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidGameConstructionParameterException(Throwable cause) {
        super(cause);
    }

    protected InvalidGameConstructionParameterException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

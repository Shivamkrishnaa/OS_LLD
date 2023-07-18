package BuilderPrototypeRegistry.Exception;

public class InvalidNameError extends RuntimeException {
    public InvalidNameError() {
        super();
    }

    public InvalidNameError(String message) {
        super(message);
    }

    public InvalidNameError(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidNameError(Throwable cause) {
        super(cause);
    }

    protected InvalidNameError(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

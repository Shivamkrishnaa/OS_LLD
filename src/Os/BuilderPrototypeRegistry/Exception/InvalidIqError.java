package Os.BuilderPrototypeRegistry.Exception;

public class InvalidIqError extends RuntimeException {
    public InvalidIqError() {
        super();
    }

    public InvalidIqError(String message) {
        super(message);
    }

    public InvalidIqError(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidIqError(Throwable cause) {
        super(cause);
    }

    protected InvalidIqError(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

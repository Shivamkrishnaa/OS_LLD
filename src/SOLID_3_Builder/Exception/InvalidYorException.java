package SOLID_3_Builder.Exception;

public class InvalidYorException extends RuntimeException{
    public InvalidYorException() {
    }

    public InvalidYorException(String message) {
        super(message);
    }

    public InvalidYorException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidYorException(Throwable cause) {
        super(cause);
    }

    public InvalidYorException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

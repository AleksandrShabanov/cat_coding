package task_exceptions.exceptions;

public class IncorrectCountryException extends RuntimeException {
    public IncorrectCountryException(String message) {
        super(message);
    }
}

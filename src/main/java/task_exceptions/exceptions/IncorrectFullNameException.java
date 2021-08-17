package task_exceptions.exceptions;

public class IncorrectFullNameException extends RuntimeException {
    public IncorrectFullNameException(String message) {
        super(message);
    }
}

package task_exceptions.exceptions;

public class IncorrectAgeException extends RuntimeException{
    public IncorrectAgeException(String message) {
        super(message);
    }
}

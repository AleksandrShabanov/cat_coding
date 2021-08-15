package task_exceptions.exceptions;

public class IncorrectAge extends RuntimeException{
    public IncorrectAge(String message) {
        super(message);
    }
}

package task_exceptions.exceptions;

public class IncorrectFullName extends RuntimeException {
    public IncorrectFullName(String message) {
        super(message);
    }
}

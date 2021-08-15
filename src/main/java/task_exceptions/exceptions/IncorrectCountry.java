package task_exceptions.exceptions;

public class IncorrectCountry extends RuntimeException {
    public IncorrectCountry(String message) {
        super(message);
    }
}

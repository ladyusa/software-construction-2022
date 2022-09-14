package exception;

public class NotEnoughMoneyException extends Exception { // checked exception

    public NotEnoughMoneyException() {
    }

    public NotEnoughMoneyException(String errorMessage) {
        super(errorMessage);
    }
}

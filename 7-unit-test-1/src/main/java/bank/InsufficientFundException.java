package bank;

public class InsufficientFundException extends Exception {
    public InsufficientFundException() {
    }

    public InsufficientFundException(String message) {
        super(message);
    }
}

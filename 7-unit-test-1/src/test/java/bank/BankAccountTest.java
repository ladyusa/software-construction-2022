package bank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BankAccountTest {

    @Test
    void testWithdrawSuccessful() throws InsufficientFundException {
        BankAccount bankAccount = new BankAccount(1000);
        bankAccount.withdraw(200);

        assertEquals(800, bankAccount.getBalance());
    }

    @Test
    void testWithdrawMoreThanBalanceShouldThrowException() {
        BankAccount bankAccount = new BankAccount(1000);

        assertThrows(InsufficientFundException.class,
                () -> {  bankAccount.withdraw(5000);  }
        );

        assertEquals(1000, bankAccount.getBalance(), 0.0001);
    }
}

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordCheckTest {

    PasswordCheck passwordChecker = new PasswordCheck();

    @Test
    void passwordIsValid() {
        String password = "Bello@10111";
        passwordChecker.passwordIsValid(password);
        assertEquals(6,passwordChecker.count,"Are all the conditions met?");
    }

    @Test
    void passwordIsOk() {
        String password = "Bello@10111";
        passwordChecker.passwordIsValid(password);
        assertTrue(passwordChecker.passwordIsOk());
    }
}
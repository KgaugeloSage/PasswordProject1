import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidatorTest {
    Validator validations = new Validator();

    @Test
    void existence() {
        String password = "rwet";

        assertTrue(validations.existence(password));
    }

    @Test
    void longer() {
        String password = "hdhkltgq";
        assertTrue(validations.longer(password));
    }

    @Test
    void lowerCase() {
        String password = "JHHHHHHHh";
        assertTrue(validations.lowerCase(password));
    }

    @Test
    void upperCase() {
        String password = "jkbhdjkfhjkH";
        assertTrue(validations.upperCase(password));
    }

    @Test
    void digit() {
        String password = "jhg^^rr5";
        assertTrue(validations.digit(password));
    }

    @Test
    void character() {
        String password = "gjhklk@dnsd";
        assertTrue(validations.character(password));
    }
}
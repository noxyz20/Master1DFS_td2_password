import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordValidatorTest {

    @Test
    public void minimalLenghtButNoDigitPasswordTest() {
        assertFalse(PasswordValidator.isValidPwd("asbide"));
    }

    @Test
    public void passwordAsDigitAndCharButNoMinimalLenght() {
        assertFalse(PasswordValidator.isValidPwd("a4de"));
    }

    @Test
    public void passwordAsDigitTest() {
        assertTrue(PasswordValidator.isValidPwd("as1ide"));
    }

    @Test
    public void passwordAsNoDigitTest() {
        assertFalse(PasswordValidator.isValidPwd("assside"));
    }

    @Test
    public void passwordAsCharTest() {
        assertTrue(PasswordValidator.isValidPwd("12345d6"));
    }

    @Test
    public void passwordAsNoCharTest() {
        assertFalse(PasswordValidator.isValidPwd("12345856"));
    }
}
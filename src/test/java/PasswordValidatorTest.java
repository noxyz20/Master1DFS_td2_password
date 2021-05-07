import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordValidatorTest {

    @Test
    public void minimalLenghtButNoDigitPasswordTest() {
        assertFalse(PasswordValidator.isValidPwdUsr("asbide"));
    }

    @Test
    public void passwordAsDigitAndCharButNoMinimalLenght() {
        assertFalse(PasswordValidator.isValidPwdUsr("a4de"));
    }

    @Test
    public void passwordAsDigitTest() {
        assertTrue(PasswordValidator.isValidPwdUsr("as1ide"));
    }

    @Test
    public void passwordAsNoDigitTest() {
        assertFalse(PasswordValidator.isValidPwdUsr("assside"));
    }

    @Test
    public void passwordAsCharTest() {
        assertTrue(PasswordValidator.isValidPwdUsr("12345d6"));
    }

    @Test
    public void passwordAsNoCharTest() {
        assertFalse(PasswordValidator.isValidPwdUsr("12345856"));
    }

    @Test
    public void passwordAdminTest() { assertTrue(PasswordValidator.isValidPwdAdmin("Jodie33!ko"));}
}
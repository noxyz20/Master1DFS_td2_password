import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordValidatorTest {

    @Test
    public void minimalLenghtPasswordTest() {
        assertTrue(PasswordValidator.isValidPwd("asbide"));
    }

    @Test
    public void passwordAsDigitTest() {
        assertTrue(PasswordValidator.isValidPwd("as1ide"));
    }
}
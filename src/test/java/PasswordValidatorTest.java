import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordValidatorTest {

    @Test
    public void minimalLenghtPasswordTest() {
        assertFalse(PasswordValidator.isValidPwd("abcdfef"));
    }
}
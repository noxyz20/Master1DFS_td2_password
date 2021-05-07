import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PasswordValidator {
    public static boolean isValidPwdUsr(String pwd) {
        if (isValidLenght(pwd, 6))
                return false;
        int nbDigit = 0;
        int nbChar = 0;
        for (int i=0; i < pwd.length(); i++){
            char currentChar = pwd.charAt(i);
            if (Character.isDigit(currentChar)){
                nbDigit++;
            }
            if (Character.isLetter(currentChar)){
                nbChar++;
            }
        }
        if (nbDigit == 0) {
            return false;
        }else if (nbChar == 0) {
            return false;
        }else {
            return true;
        }
    }
    public static boolean isValidPwdAdmin(String pwd) {
        if (isValidLenght(pwd, 10))
            return false;
        final List<Character> specialCharacters = Arrays.asList('@','#','!','.','!','$','%','&');
        int nbDigit = 0;
        int nbChar = 0;
        int nbSpec = 0;
        for (int i=0; i < pwd.length(); i++){
            char currentChar = pwd.charAt(i);
            if (Character.isDigit(currentChar)){
                nbDigit++;
            }
            if (Character.isLetter(currentChar)){
                nbChar++;
            }
            if (specialCharacters.contains(currentChar)){
                nbSpec++;
            }
        }

        if (nbDigit == 0) {
            return false;
        }else if (nbChar == 0) {
            return false;
        }else if (nbSpec == 0) {
            return false;
        }else {
            return true;
        }
    }
    private static boolean isValidLenght(String pwd, int lenght) {
        return pwd.length() < lenght;
    }
}

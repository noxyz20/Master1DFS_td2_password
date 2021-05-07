public class PasswordValidator {
    public static boolean isValidPwd(String pwd) {
        if (isValidLenght(pwd))
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

    private static boolean isValidLenght(String pwd) {
        return pwd.length() < 6;
    }
}

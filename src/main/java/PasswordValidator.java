public class PasswordValidator {
    public static boolean isValidPwd(String pwd) {
        if(pwd.length() < 6) {
            return false;
        }
        return true;
    }
}

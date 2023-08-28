import org.apache.commons.lang3.StringUtils;

public class JavaRecap1 {
    public static void main(String[] args) {

    }

    public static boolean isPasswordValid(String password) {
        String numbers = "1234567890";
        String UpperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String LowerCase = "abcdefghijklmnopqrstuvwxyz";
        return password.length() >= 8 && StringUtils.containsAny(password, numbers) && StringUtils.containsAny(password, UpperCase) && StringUtils.containsAny(password, LowerCase);
    }
}

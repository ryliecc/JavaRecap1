import org.apache.commons.lang3.StringUtils;

public class JavaRecap1 {
    public static void main(String[] args) {

    }

    public static boolean isPasswordValid(String password) {
        return password.length() >= 8 && StringUtils.containsAny(password, "1234567890");
    }
}

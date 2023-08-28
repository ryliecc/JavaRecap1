import org.apache.commons.lang3.StringUtils;

public class JavaRecap1 {
    public static void main(String[] args) {

    }

    public static boolean isPasswordValid(String password) {
        if(!isPasswordLongEnough(password)){
            return false;
        }
        if(!isPasswordWithNumbers(password)){
            return false;
        }
        if(!isPasswordWithUpperCase(password)){
            return false;
        }
        if(!isPasswordWithLowerCase(password)){
            return false;
        }
        if(!isPasswordWeak(password)){
            return false;
        }

        return true;
    }

    public static boolean isPasswordLongEnough(String password) {
        return password.length() >= 8;
    }

    public static boolean isPasswordWithNumbers(String password) {
        String numbers = "1234567890";
        return StringUtils.containsAny(password, numbers);
    }

    public static boolean isPasswordWithUpperCase(String password){
        String UpperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        return StringUtils.containsAny(password, UpperCase);
    }

    public static boolean isPasswordWithLowerCase(String password){
        String LowerCase = "abcdefghijklmnopqrstuvwxyz";
        return StringUtils.containsAny(password, LowerCase);
    }

    public static boolean isPasswordWeak(String password){
        String[] weakPasswords = {"password", "123456"};
        for(int i = 0; i < weakPasswords.length; i++){
            if(password.contains(weakPasswords[i])){
                return false;
            }
        }
        return true;
    }
}

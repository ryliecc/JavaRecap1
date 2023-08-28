public class JavaRecap1 {
    public static void main(String[] args) {

    }

    public static boolean isPasswordValid(String password) {
        int passwordLength = password.length();
        if(passwordLength >= 8){
            return true;
        }
        return false;
    }
}

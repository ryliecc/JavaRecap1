import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class JavaRecap1Test {

    @Test
    void isPasswordLongEnough_whenInputIs8Chars_returnTrue(){
        String password = "test1234";
        boolean actual = JavaRecap1.isPasswordLongEnough(password);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    void isPasswordLongEnough_whenInputIs7Chars_returnFalse(){
        String password = "test123";
        boolean actual = JavaRecap1.isPasswordLongEnough(password);
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    void isPasswordWithNumbers_whenInputContainsNumbers_returnTrue(){
        String password = "1test4YOU";
        boolean actual = JavaRecap1.isPasswordWithNumbers(password);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    void isPasswordWithNumbers_whenInputContainsNoNumbers_returnFalse(){
        String password = "testTEST";
        boolean actual = JavaRecap1.isPasswordWithNumbers(password);
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    void isPasswordWithUpperAndLowerCase_whenInputContainsUpperAndLowerCase_returnTrue(){
        String password = "TEST123test";
        boolean actual = JavaRecap1.isPasswordWithUpperAndLowerCase(password);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    void isPasswordWithUpperAndLowerCase_whenInputContainsOnlyUpperCase_returnFalse(){
        String password = "TEST1234";
        boolean actual = JavaRecap1.isPasswordWithUpperAndLowerCase(password);
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    void isPasswordWithUpperAndLowerCase_whenInputContainsOnlyLowerCase_returnFalse(){
        String password = "test1234";
        boolean actual = JavaRecap1.isPasswordWithUpperAndLowerCase(password);
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    void isPasswordWeak_whenInputContainsPassword_returnFalse(){
        String password = "password123T";
        boolean actual = JavaRecap1.isPasswordWeak(password);
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    void isPasswordWeak_whenInputContains123456_returnFalse(){
        String password = "test123456";
        boolean actual = JavaRecap1.isPasswordWeak(password);
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    void isPasswordWithSpecialChars_whenInputContainsSpecialChars_returnTrue(){
        String password = "test.45K";
        boolean actual = JavaRecap1.isPasswordWithSpecialChars(password);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    void isPasswordWithSpecialChars_whenInputContainsNoSpecialChars_returnFalse(){
        String password = "Test12test";
        boolean actual = JavaRecap1.isPasswordWithSpecialChars(password);
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    void isPasswordValid_whenInputChecksAllBoxes_returnTrue(){
        String password = "t3sTing@som3thinG";
        boolean actual = JavaRecap1.isPasswordValid(password);
        boolean expected = true;
        assertEquals(expected, actual);
    }
}

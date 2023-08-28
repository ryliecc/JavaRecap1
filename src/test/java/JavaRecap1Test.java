import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class JavaRecap1Test {

    @Test
    void isPasswordValid_whenInputIs8Chars_returnTrue(){
        String password = "Test@1234";
        boolean actual = JavaRecap1.isPasswordValid(password);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    void isPasswordValid_whenInputIs7Chars_returnFalse(){
        String password = "Test12,";
        boolean actual = JavaRecap1.isPasswordValid(password);
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    void isPasswordValid_whenInputContainsNumbers_returnTrue(){
        String password = "1test4YOU.";
        boolean actual = JavaRecap1.isPasswordValid(password);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    void isPasswordValid_whenInputContainsNoNumbers_returnFalse(){
        String password = "test-TEST";
        boolean actual = JavaRecap1.isPasswordValid(password);
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    void isPasswordValid_whenInputContainsUpperAndLowerCase_returnTrue(){
        String password = "TEST;123test";
        boolean actual = JavaRecap1.isPasswordValid(password);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    void isPasswordValid_whenInputContainsOnlyUpperCase_returnFalse(){
        String password = "TEST:1234";
        boolean actual = JavaRecap1.isPasswordValid(password);
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    void isPasswordValid_whenInputContainsOnlyLowerCase_returnFalse(){
        String password = "test+1234";
        boolean actual = JavaRecap1.isPasswordValid(password);
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    void isPasswordValid_whenInputContainsPassword_returnFalse(){
        String password = "password123*T";
        boolean actual = JavaRecap1.isPasswordValid(password);
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    void isPasswordValid_whenInputContains123456_returnFalse(){
        String password = "Password/123456";
        boolean actual = JavaRecap1.isPasswordValid(password);
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    void isPasswordValid_whenInputContainsSpecialChars_returnTrue(){
        String password = "test.45K";
        boolean actual = JavaRecap1.isPasswordValid(password);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    void isPasswordValid_whenInputContainsNoSpecialChars_returnFalse(){
        String password = "Test12test";
        boolean actual = JavaRecap1.isPasswordValid(password);
        boolean expected = false;
        assertEquals(expected, actual);
    }
}

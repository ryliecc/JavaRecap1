import org.junit.jupiter.api.Test;

import java.time.chrono.JapaneseChronology;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JavaRecap1Test {

    @Test
    void isPasswordValid_whenInputIs8Chars_returnTrue(){
        String password = "Test1234";
        boolean actual = JavaRecap1.isPasswordValid(password);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    void isPasswordValid_whenInputIs7Chars_returnFalse(){
        String password = "Test123";
        boolean actual = JavaRecap1.isPasswordValid(password);
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    void isPasswordValid_whenInputContainsNumbers_returnTrue(){
        String password = "1test4YOU";
        boolean actual = JavaRecap1.isPasswordValid(password);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    void isPasswordValid_whenInputContainsNoNumbers_returnFalse(){
        String password = "testTEST";
        boolean actual = JavaRecap1.isPasswordValid(password);
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    void isPasswordValid_whenInputContainsUpperAndLowerCase_returnTrue(){
        String password = "TEST123test";
        boolean actual = JavaRecap1.isPasswordValid(password);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    void isPasswordValid_whenInputContainsOnlyUpperCase_returnFalse(){
        String password = "TEST1234";
        boolean actual = JavaRecap1.isPasswordValid(password);
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    void isPasswordValid_whenInputContainsOnlyLowerCase_returnFalse(){
        String password = "test1234";
        boolean actual = JavaRecap1.isPasswordValid(password);
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    void isPasswordValid_whenInputContainsPassword_returnFalse(){
        String password = "password123T";
        boolean actual = JavaRecap1.isPasswordValid(password);
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    void isPasswordValid_whenInputContains123456_returnFalse(){
        String password = "Password123456";
        boolean actual = JavaRecap1.isPasswordValid(password);
        boolean expected = false;
        assertEquals(expected, actual);
    }
}

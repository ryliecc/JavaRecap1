import org.junit.jupiter.api.Test;

import java.time.chrono.JapaneseChronology;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JavaRecap1Test {

    @Test
    void isPasswordValid_whenInputIs8Chars_returnTrue(){
        String password = "test1234";
        boolean actual = JavaRecap1.isPasswordValid(password);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    void isPasswordValid_whenInputIs7Chars_returnFalse(){
        String password = "test123";
        boolean actual = JavaRecap1.isPasswordValid(password);
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    void isPasswordValid_whenInputContainsNumbers_returnTrue(){
        String password = "1test4you";
        boolean actual = JavaRecap1.isPasswordValid(password);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    void isPasswordValid_whenInputContainsNoNumbers_returnFalse(){
        String password = "testtest";
        boolean actual = JavaRecap1.isPasswordValid(password);
        boolean expected = false;
        assertEquals(expected, actual);
    }
}

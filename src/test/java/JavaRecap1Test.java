import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class JavaRecap1Test {

    @Test
    void isPasswordValid_whenInputIs8Chars_returnTrue(){
        String password = "testtest";
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
}

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class RegexValidatorTest {
    @Test
    public void testForValidEmailFormat () {
        String email = "p.nkwankwo@native.semicolon.africa";
        boolean expected = RegexValidator.validateEmail(email);
        assertTrue(expected);
    }

    @Test
    public void testForValidEmailFormatTwo () {
        String email = "m.brwnboi@native.semicolon.africa";
        boolean expected = RegexValidator.validateEmail(email);
        assertTrue(expected);
    }

    @Test
    public void testForValidEmailFormatWithSpaces () {
        String email = "  p.nkwankwo@native.semicolon.africa  ";
        boolean expected = RegexValidator.validateEmail(email);
        assertTrue(expected);
    }

    @Test
    public void testForValidEmailFormatInUpperCase () {
        String email = "M.BRWNBOI@NATIVE.SEMICOLON.AFRICA";
        boolean expected = RegexValidator.validateEmail(email);
        assertTrue(expected);
    }

    @Test
    public void testForValidEmailFormatWithSpacesInBetween () {
        String email = "m. brwn boi @ native . semi colon.africa ";
        boolean expected = RegexValidator.validateEmail(email);
        assertFalse(expected);
    }


    @Test
    public void testForValidPassword () {
        String password = "brwnboi00";
        boolean expected = RegexValidator.validatePassword(password);
        assertFalse(expected);
    }


    @Test
    public void testForValidPasswordOne () {
        String password = "brwnboi@00";
        boolean expected = RegexValidator.validatePassword(password);
        assertTrue(expected);
    }

    @Test
    public void testForValidPasswordTwo () {
        String password = "Java code@1";
        boolean expected = RegexValidator.validatePassword(password);
        assertTrue(expected);
    }
    @Test
    public void testForValidPasswordThree () {
        String password = "Welcome 123$";
        boolean expected = RegexValidator.validatePassword(password);
        assertTrue(expected);
    }



}

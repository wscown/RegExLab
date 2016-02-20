import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by wscown on 2/20/16.
 */
public class RegExTest {

    @Test
    public void testIsValidUsername() throws Exception {

        String testinputfalse1 = "a";
        String testinputfalse2 = "aa";
        String testinputfalse3 = "aa1";
        String testinputfalse4 = "aa!";
        String testinputfalse5 = "aa?";
        String testinputfalse6 = "abcdefghijklmnopqrstuvwxyz";
        String testinputfalse7 = "abcdefghijklmno1qrstuvwxy";
        String testinputfalse8 = "abcdefghijklmNopqrstuvwxy";

        String testinputtrue1 = "abc";
        String testinputtrue2 = "abcdefghijklmnopqrstuvwxy";
        String testinputtrue3 = "apotentialusername";

        assertTrue(RegEx.isValidUsername(testinputtrue1));
        assertTrue(RegEx.isValidUsername(testinputtrue2));
        assertTrue(RegEx.isValidUsername(testinputtrue3));

        assertTrue(!RegEx.isValidUsername(testinputfalse1));
        assertTrue(!RegEx.isValidUsername(testinputfalse2));
        assertTrue(!RegEx.isValidUsername(testinputfalse3));
        assertTrue(!RegEx.isValidUsername(testinputfalse4));
        assertTrue(!RegEx.isValidUsername(testinputfalse5));
        assertTrue(!RegEx.isValidUsername(testinputfalse6));
        assertTrue(!RegEx.isValidUsername(testinputfalse7));
        assertTrue(!RegEx.isValidUsername(testinputfalse8));

    }

    @Test
    public void testIsValidEnhancedUsername() throws Exception {

        String testinputfalse1 = "a";
        String testinputfalse2 = "aa";
        String testinputfalse3 = "4abc";
        String testinputfalse4 = "aa!";
        String testinputfalse5 = "aa?";
        String testinputfalse6 = "abcdefghijklmnopqrstuvwxyz";
        String testinputfalse7 = "abcdefghijklmno-qrstuvwxy";
        String testinputfalse8 = "abcdefghijklmNopqrstuvwxy";
        String testinputfalse9 = "_abc";

        String testinputtrue1 = "abc";
        String testinputtrue2 = "abcdefghijklmnopqrstuvwxy";
        String testinputtrue3 = "apotentialusername";
        String testinputtrue4 = "a3b";
        String testinputtrue5 = "ab2";
        String testinputtrue6 = "ab_";
        String testinputtrue7 = "a_b";
        String testinputtrue8 = "b1234567890";
        String testinputtrue9 = "c_____123456789_____";

        assertTrue(RegEx.isValidEnhancedUsername(testinputtrue1));
        assertTrue(RegEx.isValidEnhancedUsername(testinputtrue2));
        assertTrue(RegEx.isValidEnhancedUsername(testinputtrue3));
        assertTrue(RegEx.isValidEnhancedUsername(testinputtrue4));
        assertTrue(RegEx.isValidEnhancedUsername(testinputtrue5));
        assertTrue(RegEx.isValidEnhancedUsername(testinputtrue6));
        assertTrue(RegEx.isValidEnhancedUsername(testinputtrue7));
        assertTrue(RegEx.isValidEnhancedUsername(testinputtrue8));
        assertTrue(RegEx.isValidEnhancedUsername(testinputtrue9));

        assertTrue(!RegEx.isValidEnhancedUsername(testinputfalse1));
        assertTrue(!RegEx.isValidEnhancedUsername(testinputfalse2));
        assertTrue(!RegEx.isValidEnhancedUsername(testinputfalse3));
        assertTrue(!RegEx.isValidEnhancedUsername(testinputfalse4));
        assertTrue(!RegEx.isValidEnhancedUsername(testinputfalse5));
        assertTrue(!RegEx.isValidEnhancedUsername(testinputfalse6));
        assertTrue(!RegEx.isValidEnhancedUsername(testinputfalse7));
        assertTrue(!RegEx.isValidEnhancedUsername(testinputfalse8));
        assertTrue(!RegEx.isValidEnhancedUsername(testinputfalse9));
    }

    @Test
    public void testIsValidIPAddress() throws Exception {
        String testinputfalse1 = "1a.2.3.4";
        String testinputfalse2 = "1000.255.255.255";
        String testinputfalse3 = "255.255.255.2551";
        String testinputfalse4 = "1.1..1.1";
        String testinputfalse5 = "256.1.1.1";
        String testinputfalse6 = "999.999.999.999";
        String testinputfalse7 = "1 1.255.255.1";

        String testinputtrue1 = "1.1.1.1";
        String testinputtrue2 = "10.10.10.10";
        String testinputtrue3 = "123.123.123.123";
        String testinputtrue4 = "255.255.255.255";
        String testinputtrue5 = "01.01.01.01";
        String testinputtrue6 = "00000000001.00000000000255.00000001.00000000000000000255";
        String testinputtrue7 = "222.1.255.0000000000001";

        assertTrue(RegEx.isValidEnhancedUsername(testinputtrue1));
        assertTrue(RegEx.isValidEnhancedUsername(testinputtrue2));
        assertTrue(RegEx.isValidEnhancedUsername(testinputtrue3));
        assertTrue(RegEx.isValidEnhancedUsername(testinputtrue4));
        assertTrue(RegEx.isValidEnhancedUsername(testinputtrue5));
        assertTrue(RegEx.isValidEnhancedUsername(testinputtrue6));
        assertTrue(RegEx.isValidEnhancedUsername(testinputtrue7));

        assertTrue(!RegEx.isValidEnhancedUsername(testinputfalse1));
        assertTrue(!RegEx.isValidEnhancedUsername(testinputfalse2));
        assertTrue(!RegEx.isValidEnhancedUsername(testinputfalse3));
        assertTrue(!RegEx.isValidEnhancedUsername(testinputfalse4));
        assertTrue(!RegEx.isValidEnhancedUsername(testinputfalse5));
        assertTrue(!RegEx.isValidEnhancedUsername(testinputfalse6));
        assertTrue(!RegEx.isValidEnhancedUsername(testinputfalse7));
    }

    @Test
    public void testIsPalinDrome() throws Exception {

    }
}
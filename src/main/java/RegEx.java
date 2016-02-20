import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by wscown on 2/20/16.
 */
public class RegEx {

    public static boolean isValidUsername(String input){

        Pattern p = Pattern.compile("[a-z]{3,25}");
        Matcher m = p.matcher(input);

        return m.matches();
    }

    public static boolean isValidEnhancedUsername(String input){
        Pattern p = Pattern.compile("[a-z][a-z\\d_]{2,24}");
        Matcher m = p.matcher(input);

        return m.matches();
    }

    public static boolean isValidIPAddress(String input){
        Pattern p = Pattern.compile("^((0*[0-2][0-5][0-5])|(0*[1-9]\\d)|0*[1-9])\\.((0*[0-2][0-5][0-5])|(0*[1-9]\\d)|0*[1-9])\\.((0*[0-2][0-5][0-5])|(0*[1-9]\\d)|0*[1-9])\\.((0*[0-2][0-5][0-5])|(0*[1-9]\\d)|0*[1-9])$");
        Matcher m = p.matcher(input);
        return m.matches();
    }

    public static boolean isPalinDrome(String input){

        //Not possible to check for any palindrome as regex would have to have to be infinitely long or would have
        //to have the ability to remember unlimited number of states.

        return false;
    }
}

import java.util.List;

public class App {
    public static void main(String[] args) {
        check("ninja", "ja", true);
        check("sensei", "i", true);
        check("samurai", "ra", false);
        check("abc", "abcd", false);
        check("abc", "abc", true);
        check("abcabc", "bc", true);
        check("ails", "fails", false);
        check("fails", "ails", true);
        check("this", "fails", false);
        check("this", "", true);
        check(":-)", ":-(", false);
    }

    public static void check(String str1, String str2, boolean expectedResult) {
        boolean result = isSubstring(str1, str2);
        System.out.println("Check(" + str1 + ", " + str2 + ", " + expectedResult + "): " + result);
    }

    public static boolean isSubstring(String str1, String str2) {
        if (str1 == null || str2 == null) {
            return false;
        }

        if (str2.isEmpty()) {
            // An empty string is always a substring
            return true;
        }

        return str1.contains(str2);
    }

}

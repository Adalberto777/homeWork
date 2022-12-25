package homeWorkTwo;


import static java.lang.StringUTF16.charAt;
import static java.net.HttpCookie.equalsIgnoreCase;

public class Main {
    public static void main(String[] args) {
        System.out.println(checkPalindrome("ararat"));
    }

    private static boolean checkPalindrome(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = str.length(); i > 0; i--) {
            sb.append(str.charAt(i));
        }

        if ((str.equalsIgnoreCase(sb.toString()))) return true;
        else return false;
    }
}

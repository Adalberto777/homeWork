package homeWorkTwo;


public class Main {
    public static void main(String[] args) {
        System.out.println(checkPalindrome("arrara"));
    }

    private static boolean checkPalindrome(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = str.length() - 1; i > -1; i--) {
            sb.append(str.charAt(i));
        }
        if ((str.equalsIgnoreCase(sb.toString()))) return true;
        else return false;
    }
}

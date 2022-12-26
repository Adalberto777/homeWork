package homeWorkTwo;


import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
//        System.out.println(checkPalindrome("arrara"));
        writeTestInString("TEST", 100);
        writeTestToFile();

    }

    private static void writeTestToFile() throws FileNotFoundException {
        PrintWriter pw = null;
        try {
            pw = new PrintWriter("src/main/resources/sours/test.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException("Error, can't find this directory");
        }
        pw.println(writeTestInString("TEST", 100));
        pw.close();
    }

    private static String writeTestInString(String str, Integer count) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(str);
        }
        return sb.toString();
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

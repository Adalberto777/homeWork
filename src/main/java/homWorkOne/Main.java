package homWorkOne;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task01();

    }

    private static void task01() {
        System.out.print("Enter number first: ");
        Scanner scanner = new Scanner(System.in);
        int num_first = scanner.nextInt();
        System.out.print("Enter number second: ");
        int num_second = scanner.nextInt();
        int s = num_first + num_second;
        if (s >= 10 && s <= 20){
            System.out.println("TRUE");
        }else {
            System.out.println("FALSE");
        }
    }
}

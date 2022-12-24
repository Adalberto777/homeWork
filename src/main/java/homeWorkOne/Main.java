package homeWorkOne;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        task01();
//        task02();
//        task03();
//        task04();
//        task06();
//        task07();
//        task08();
//        task09();
//        task10();
//        task11();
        task05();


    }

    private static void task05() {
        System.out.print("Enter year: ");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        if (year % 400 == 0) {
            System.out.print("TRUE: ");
        } else if (year % 4 == 0 & year % 100 != 0) {
            System.out.print("TRUE: ");
        } else System.out.print("FALSE: ");


    }

    private static void task11() {
        int [] arr = new int[10];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10);
            System.out.print(arr[i]);
        }
        System.out.println();
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
                }
            }
        System.out.printf("max element: %d%n", max);
        System.out.printf("min element: %d%n", min);
    }

    private static void task10() {
        System.out.print("Enter number of members: ");
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        System.out.print("Enter initial value : ");
        int num = scanner.nextInt();
        int [] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = num;
            System.out.print(arr[i]);
        }
    }

    private static void task09() {
        int [][] arr = new int[7][7];
        for (int i = 0; i < arr.length; i++) {
            arr[i][i] = 1;
            arr[i][arr.length - 1 - i] = 1;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }

    private static void task08() {
        int [] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }System.out.println(Arrays.toString(arr));
    }

    private static void task07() {
        int [] arr = new int[100];
        int count = 1;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = count;
            count ++;
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void task06() {
        int [] arr = new int[15];
        Random random = new Random();
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = random.nextInt(2);
        }
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            }else {
                arr[i] = 0;
            }
        }System.out.println(Arrays.toString(arr));
    }

    private static void task04() {
        System.out.print("Enter number string: ");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();
        System.out.print("Enter number : ");
        int num = scanner.nextInt();
        for (int i = 0; i < num; i++) {
            System.out.println(string);
        }
    }

    private static void task03() {
        System.out.print("Enter number: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (0 > num){
            System.out.println("TRUE");
        }else {
            System.out.println("FALSE");
        }
    }

    private static void task02() {
        System.out.print("Enter number: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (0 > num){
            System.out.println("negative number");
        }else {
            System.out.println("positive number");
        }
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

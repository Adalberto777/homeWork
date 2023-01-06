package homeWorkFour;

import java.util.Collections;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        revers();
    }

    private static void revers() {
        LinkedList<Integer> numList = new LinkedList<>();
        Collections.addAll(numList, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.printf("Sours list: %s%n", numList);
        for (int i = 0; i <= (numList.size() - 1)/ 2; i++) {
            int temp = numList.get(i);
            numList.set(i, numList.get(numList.size() - 1 - i));
            numList.set((numList.size() - 1 - i), temp);
        }
        System.out.printf("Revers list: %s", numList);
    }
}

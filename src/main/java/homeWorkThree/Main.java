package homeWorkThree;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Random;


public class Main {
    public static void main(String[] args) {
//        delEvenNum();
        maxMinAverage();
    }

    private static void maxMinAverage() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(100));
        }
        System.out.println(list);
        System.out.println("maximum number in the list: " + Collections.max(list));
        System.out.println("minimum number in the list: " + Collections.min(list));
        double sum = 0;
        for (int i = 0; i < list.size(); i++) {
           sum +=list.get(i);
        }
        double average = sum/list.size();
        System.out.println("average in the list: " + average);
    }

    private static void delEvenNum() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(100));
        }
        System.out.println(list);

        Iterator<Integer> listIterator = list.iterator();
        while(listIterator.hasNext()){
            int nextNum= listIterator.next();
            if (nextNum % 2 == 0) {
                listIterator.remove();
            }
        }
        System.out.println(list);
    }
    }

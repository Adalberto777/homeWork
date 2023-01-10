package homeWorkFive;

import java.util.*;

public class Main {
    private static Map<String, ArrayList<String>> telephoneDictionary = new HashMap<>();
    public static void main(String[] args) {
        ArrayList<String> telephone = new ArrayList<>();
        Collections.addAll(telephone, "89178889993", "89188889998", "89138889997");
        telephoneDictionary.put("Ivanov" , telephone);
        System.out.println(telephoneDictionary);

        Scanner in = new Scanner(System.in);
        System.out.print("If you wont create new record choice 1, if find telephone number choice 2: ");
        String choice= in.next();
        if (choice.equals("1")) {
            record();
            System.out.println(telephoneDictionary);
        }

        if (choice.equals("2")) {
            find();
        }


    }

    private static void find() {
        Scanner in = new Scanner(System.in);
        String name = new String();

        System.out.print("Enter name: ");
        name = in.next();
        System.out.println(telephoneDictionary.get(name));


    }

    private static void record() {
        Scanner in = new Scanner(System.in);
        ArrayList<String> telephoneList = new ArrayList<>();
        String name = new String();

        System.out.print("Enter name: ");
        name = in.next();

        while (true){
            System.out.print("Enter telephone number: ");
            String num = in.next();
            if (num.equals("stop")){
                telephoneDictionary.put(name, telephoneList);
                break;
            } else {
                telephoneList.add(num);
            }

        }

        }

    }



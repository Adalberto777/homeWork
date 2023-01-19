package homeWorkSix;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<NoteBook> notebooks = new ArrayList<>();
        notebooks.add(new NoteBook("Huawei", "MateBook D 15 BOD-WDI9", "15.6", "Intel Core i3 1115G4 3.0ГГц", "8 ГБ", "256 ГБ SSD", "Windows 11 Home", "silver"));
        notebooks.add(new NoteBook("Huawei", "MateBook D 15 BoD-WDH9", "15.6", "Intel Core i5 1135G7 2.4ГГц", "8 ГБ", "256 ГБ SSD", "Windows 11 Home", "silver"));
        notebooks.add(new NoteBook("Huawei", "MateBook 14 KLVL-W56W", "14", "AMD Ryzen 5 5500U 2.1ГГц", "16 ГБ", "512 ГБ SSD", "Windows 11 Home", "gray"));
        notebooks.add(new NoteBook("MSI", "Modern 15 A11MU-1064XRU", "15.6", "Intel Core i5 1155G7 2.5ГГц", "8 ГБ", "512 ГБ SSD", "Free DOS", "gray"));
        notebooks.add(new NoteBook("MSI", "Modern 14 B5M-244XRU", "14", "AMD Ryzen 5 5500U 2.1ГГц", "16ГБ", "512ГБ SSD", "Free DOS", "gray"));
        notebooks.add(new NoteBook("MSI", "Pulse GL66 12UGSZOK-1032XRU", "15.6", "Intel Core i7 12700H 2.3ГГц", "16 ГБ", "512 ГБ SSD", "Free DOS", "gray"));
        while (true) {
            System.out.println("MENU: \n" +
                    "1 - PRINT CATALOG \n" +
                    "2 - FOUND NOTEBOOK \n" +
                    "3 - EXIT \n" +
                    "YOUR CHOICE: ");
            Scanner scanner = new Scanner(System.in);
            String choose = scanner.nextLine();


            if (choose.equals("1")) {
                printCatalog(notebooks);
            } else if (choose.equals("2")) {
                found(userIn(), notebooks);
            } else if (choose.equals("3")) {
                scanner.close();
                break;
            } else {
                System.out.println("YOU HAVE TO CHOOSE A NUMBER FROM 0 TO 3");
            }
        }
    }

    private static void printCatalog(List<NoteBook> notebooks) {
        Iterator<NoteBook> i = notebooks.iterator();
        while (i.hasNext())
            System.out.println(i.next());
    }

    public static HashMap<String, String> userIn() {
        HashMap<String, String> userIn = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER THE SEARCH PARAMETERS: ");

        System.out.print("ENTER THE brand: ");
        userIn.put("brand", scanner.nextLine());

        System.out.print("ENTER THE model: ");
        userIn.put("model", scanner.nextLine());

        System.out.print("ENTER THE display: ");
        userIn.put("display", scanner.nextLine());

        System.out.print("ENTER THE processor: ");
        userIn.put("processor", scanner.nextLine());

        System.out.print("ENTER THE ram: ");
        userIn.put("ram", scanner.nextLine());

        System.out.print("ENTER THE memory: ");
        userIn.put("memory", scanner.nextLine());

        System.out.print("ENTER THE os: ");
        userIn.put("os", scanner.nextLine());

        System.out.print("ENTER THE color: ");
        userIn.put("color", scanner.nextLine());

        return userIn;
    }

    private static void found(HashMap<String, String> userIn, ArrayList<NoteBook> notebooks) {
        System.out.println(userIn);
        for (int i = 0; i < notebooks.size(); i++) {
            if (userIn.get("brand").equals((notebooks.get(i)).getBrand()) || userIn.get("brand") == "") {
                if (userIn.get("model").equals((notebooks.get(i)).getModel()) || userIn.get("model") == "") {
                    if (userIn.get("display").equals((notebooks.get(i)).getDisplay()) || userIn.get("display") == "") {
                        if (userIn.get("processor").equals((notebooks.get(i)).getProcessor()) || userIn.get("processor") == "") {
                            if (userIn.get("ram").equals((notebooks.get(i)).getRam()) || userIn.get("ram") == "") {
                                if (userIn.get("os").equals((notebooks.get(i)).getOs()) || userIn.get("os") == "") {
                                    if (userIn.get("color").equals((notebooks.get(i)).getColor()) || userIn.get("color") == "") {
                                        System.out.println(notebooks.get(i));
                                    }
                                }
                            }
                        }
                    }
                }
            }
            else {
                System.out.println("NOT FOUND");
            }
        }
    }
}
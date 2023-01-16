package homeWorkSix;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashSet<NoteBook> notebooks = new HashSet<>();
        notebooks.add(new NoteBook("Huawei ", "MateBook D 15 BOD-WDI9", "15.6", "Intel Core i3 1115G4 3.0ГГц", "8ГБ", "256ГБ SSD", "Windows 11 Home", "silver"));
        notebooks.add(new NoteBook("Huawei ", "MateBook D 15 BoD-WDH9", "15.6", "Intel Core i5 1135G7 2.4ГГц", "8ГБ", "256ГБ SSD", "Windows 11 Home", "silver"));
        notebooks.add(new NoteBook("Huawei ", "MateBook 14 KLVL-W56W", "14", "AMD Ryzen 5 5500U 2.1ГГц", "16ГБ", "512ГБ SSD", "Windows 11 Home", "gray"));
        notebooks.add(new NoteBook("MSI ", "Modern 15 A11MU-1064XRU", "15.6", "Intel Core i5 1155G7 2.5ГГц", "8ГБ", "512ГБ SSD", "Free DOS", "gray"));
        notebooks.add(new NoteBook("MSI ", "Modern 14 B5M-244XRU", "14", "AMD Ryzen 5 5500U 2.1ГГц", "16ГБ", "512ГБ SSD", "Free DOS", "gray"));
        notebooks.add(new NoteBook("MSI ", "Pulse GL66 12UGSZOK-1032XRU", "15.6", "Intel Core i7 12700H 2.3ГГц", "16ГБ", "1ТБ SSD", "Free DOS", "gray"));
    }

    public static HashMap<String, String> userIn() {
        HashMap<String, String> userIn = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER THE SEARCH PARAMETERS: ");

        System.out.print("ENTER THE brand:");
        userIn.put("brand", scanner.nextLine());

        System.out.print("ENTER THE model:");
        userIn.put("model", scanner.nextLine());

        System.out.print("ENTER THE display:");
        userIn.put("display", scanner.nextLine());

        System.out.print("ENTER THE processor:");
        userIn.put("processor", scanner.nextLine());

        System.out.print("ENTER THE ram:");
        userIn.put("ram", scanner.nextLine());

        System.out.print("ENTER THE memory:");
        userIn.put("memory", scanner.nextLine());

        System.out.print("ENTER THE os:");
        userIn.put("os", scanner.nextLine());

        System.out.print("ENTER THE color:");
        userIn.put("color", scanner.nextLine());

        scanner.close();
        return userIn;
    }

    public static void search(HashMap<String, String> userIn, HashSet<NoteBook> catalog) {
        Boolean noResultsFlag = true;
        for (NoteBook nb : catalog) {
            if (userIn.get("brand").equals(nb.getBrand()) || userIn.get("brand") == "") {
                if (userIn.get("color").equals(nb.getBrand()) || userIn.get("color") == "") {
                    if (userIn.get("os_type").equals(nb.getBrand()) || userIn.get("os_type") == "") {
                        if (nb.getDisplSize() >= Integer.parseInt(userIn.get("display_size")) &&
                                (nb.getHDDvolume() >= Integer.parseInt(userIn.get("hdd_volume"))) &&
                                (nb.getRAMvolume() >= Integer.parseInt(userIn.get("ram_volume")))) {
                            System.out.println(nb);
                            noResultsFlag=false;
                        }
                    }
                }
            }

        }
        if (noResultsFlag){
            System.out.println("По вашему запросу ничего не найдено.");
        }
    }
}

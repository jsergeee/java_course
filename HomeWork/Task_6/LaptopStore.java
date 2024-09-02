package HomeWork.Task_6;

import java.util.*;

public class LaptopStore {

    public static void main(String[] args) {
        Set<Laptop> laptops = new HashSet<>(Arrays.asList(
                new Laptop("Dell", 16, 512, "Windows", "Black"),
                new Laptop("HP", 8, 256, "Windows", "Silver"),
                new Laptop("Apple", 8, 256, "macOS", "Gray"),
                new Laptop("Asus", 16, 1024, "Linux", "Black"),
                new Laptop("Lenovo", 32, 512, "Windows", "White")
        ));

        Map<String, Object> param = getparamFromUser();
        List<Laptop> filteredLaptops = filterLaptops(laptops, param);

        System.out.println("Filtered Laptops:");
        for (Laptop laptop : filteredLaptops) {
            System.out.println(laptop);
        }
    }

    private static Map<String, Object> getparamFromUser() {
        Scanner scanner = new Scanner(System.in);
        Map<String, Object> param = new HashMap<>();

        System.out.println("Введите цифру, соответствующую необходимому критерию:");
        System.out.println("1 - ОЗУ");
        System.out.println("2 - Объем ЖД");
        System.out.println("3 - Операционная система");
        System.out.println("4 - Цвет");

        int choice = scanner.nextInt();
        scanner.nextLine();  // consume newline

        switch (choice) {
            case 1:
                System.out.print("Введите минимальный объем ОЗУ: ");
                param.put("ram", scanner.nextInt());
                break;
            case 2:
                System.out.print("Введите минимальный объем ЖД: ");
                param.put("storage", scanner.nextInt());
                break;
            case 3:
                System.out.print("Введите операционную систему: ");
                param.put("os", scanner.nextLine());
                break;
            case 4:
                System.out.print("Введите цвет: ");
                param.put("color", scanner.nextLine());
                break;
            default:
                System.out.println("Неверный выбор.");
        }

        return param;
    }

    private static List<Laptop> filterLaptops(Set<Laptop> laptops, Map<String, Object> param) {
        List<Laptop> filtered = new ArrayList<>();

        for (Laptop laptop : laptops) {
            boolean matches = true;

            if (param.containsKey("ram") && laptop.getRam() < (int) param.get("ram")) {
                matches = false;
            }
            if (param.containsKey("storage") && laptop.getStorage() < (int) param.get("storage")) {
                matches = false;
            }
            if (param.containsKey("os") && !laptop.getOs().equalsIgnoreCase((String) param.get("os"))) {
                matches = false;
            }
            if (param.containsKey("color") && !laptop.getColor().equalsIgnoreCase((String) param.get("color"))) {
                matches = false;
            }

            if (matches) {
                filtered.add(laptop);
            }
        }

        return filtered;
    }
}

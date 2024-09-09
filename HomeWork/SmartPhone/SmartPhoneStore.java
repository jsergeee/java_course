package HomeWork.SmartPhone;


import java.util.*;

public class SmartPhoneStore {
    public static void main (String[]args){
        Set<SmartPh> smartPhs = new HashSet<>(Arrays.asList(
                new SmartPh("Redme", 8, 256,"Android","Black"),
                new SmartPh("Infinix", 16, 64,"Android","Black"),
                new SmartPh("Honor", 8, 128,"Android","Black"),
                new SmartPh("Samsung", 16, 128,"Android","Black"),
                new SmartPh("Nokia", 4, 128,"Avrora","Black"),
                new SmartPh("iPhome", 4, 32,"IOS","Black"),
                new SmartPh("Realme", 32, 16,"Android","Black")
        ));

        List<SmartPh> smartPhList = new ArrayList<>(smartPhs);
//
//        // Вывод третьего элемента (индексация начинается с 0)
//        if (smartPhList.size() > 2) {
//            System.out.println(smartPhList.get(2));
//        } else {
//            System.out.println("Элемент с таким индексом не существует.");
//        }
        System.out.println("Set: " + smartPhs);
        System.out.println("List: " + smartPhList);
//
//        List<SmartPh> smartPhList = new ArrayList<>(Arrays.asList(
//                new SmartPh("Redme", 8, 256, "Android", "Black"),
//                new SmartPh("Infinix", 16, 64, "Android", "Black"),
//                new SmartPh("Honor", 8, 128, "Android", "Black"),
//                new SmartPh("Samsung", 16, 128, "Android", "Black"),
//                new SmartPh("Nokia", 4, 128, "Avrora", "Black"),
//                new SmartPh("iPhone", 4, 32, "iOS", "Black"),
//                new SmartPh("Realme", 32, 16, "Android", "Black")
//        ));
////         Вывод всех элементов списка
//        for (SmartPh smartPh : smartPhList) {
//            System.out.println(smartPh);
//        }


    }


}

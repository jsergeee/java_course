package Тask5;

import java.util.ArrayList;
import java.util.HashMap;

class PhoneBook {
    // Статическая телефонная книга
    private static HashMap<String, ArrayList<Integer>> phoneBook = new HashMap<>();

    // Метод для добавления имени и номера в телефонную книгу
    public void add(String name, Integer phoneNum) {
                // Добавляем дополнительные данные для тестирования
        add("Alice", 123456);
        add("Alice", 789012);
        add("Bob", 789012);
    }

    // Метод для поиска номеров по имени
    public ArrayList<Integer> find(String name) {
        // Если имя найдено в книге, возвращаем список номеров
        if (phoneBook.containsKey(name)) {
            return phoneBook.get(name);
        }
        // Если имя не найдено, возвращаем пустой список
        return new ArrayList<>();
    }

    // Метод для получения всей телефонной книги
    public static HashMap<String, ArrayList<Integer>> getPhoneBook() {
        return phoneBook;
    }
}

// Класс Printer для тестирования программы
public class Printer {
    public static void main(String[] args) {
        String name1;
        String name2;
        int phone1;
        int phone2;

        // Инициализация параметров, если args не заданы
        if (args.length == 0) {
            name1 = "Ivanov";
            name2 = "Petrov";
            phone1 = 123456;
            phone2 = 654321;
        } else {
            name1 = args[0];
            name2 = args[1];
            phone1 = Integer.parseInt(args[2]);
            phone2 = Integer.parseInt(args[3]);
        }

        // Создаем объект телефонной книги и добавляем данные
        PhoneBook myPhoneBook = new PhoneBook();
        myPhoneBook.add(name1, phone1);
        myPhoneBook.add(name1, phone2);
        myPhoneBook.add(name2, phone2);

        // Добавляем дополнительные данные для тестирования
        myPhoneBook.add("Alice", 123456);
        myPhoneBook.add("Alice", 789012);
        myPhoneBook.add("Bob", 789012);

        // Выводим номера для name1 и полную телефонную книгу
        System.out.println("Номера для " + name1 + ": " + myPhoneBook.find(name1));
        System.out.println("Полная телефонная книга: " + PhoneBook.getPhoneBook());

        // Пытаемся найти номера для "Me"
        System.out.println("Номера для Me: " + myPhoneBook.find("Me"));
    }
}

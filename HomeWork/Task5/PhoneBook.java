package HomeWork.Task5;
import java.util.ArrayList;
import java.util.HashMap;

class PhoneBook {
    // Телефонная книга в виде HashMap
    private HashMap<String, ArrayList<Integer>> phoneBook = new HashMap<>();

    // Метод для добавления имени и номера в телефонную книгу
    public void add(String name, Integer phoneNum) {
        // Если имя уже существует, добавляем номер в список
        if (phoneBook.containsKey(name)) {
            phoneBook.get(name).add(phoneNum);
        } else {
            // Если имя не существует, создаем новый список с одним номером
            ArrayList<Integer> phoneNumbers = new ArrayList<>();
            phoneNumbers.add(phoneNum);
            phoneBook.put(name, phoneNumbers);
        }
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
    public HashMap<String, ArrayList<Integer>> getPhoneBook() {
        return phoneBook;
    }
    public static void main(String[] args) {
        // Создаем объект телефонной книги
        PhoneBook myPhoneBook = new PhoneBook();

        // Добавляем записи в телефонную книгу
        myPhoneBook.add("Alice", 123456);
        myPhoneBook.add("Alice", 789012);
        myPhoneBook.add("Bob", 789012);

        // Команды для поиска и вывода телефонной книги
        System.out.println(myPhoneBook.find("Alice")); // [123456, 789012]
        System.out.println(myPhoneBook.getPhoneBook()); // {Bob=[789012], Alice=[123456, 789012]}
        System.out.println(myPhoneBook.find("Me")); // []
    }
}



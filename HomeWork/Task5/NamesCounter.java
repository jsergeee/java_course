import java.util.HashMap;

public class NamesCounter {
    private HashMap<String, Integer> names = new HashMap<>();

    // Метод для добавления имени в HashMap
    public void addName(String name) {
        // Если имя уже существует, увеличиваем счетчик на 1
        if (names.containsKey(name)) {
            names.put(name, names.get(name) + 1);
        } else {
            // Если имя не существует, добавляем его в HashMap со значением 1
            names.put(name, 1);
        }
    }

    // Метод для вывода содержимого HashMap
    public void showNamesOccurrences() {
        // Выводим содержимое HashMap
        System.out.println(names);
    }

    public static void main(String[] args) {
        NamesCounter counter = new NamesCounter();

        // Имена по умолчанию
        String[] defaultNames = {"Elena", "Elena", "Elena", "Ivan", "Ivan"};

        // Используем имена из аргументов, если они предоставлены
        String[] namesToAdd = args.length > 0 ? args : defaultNames;

        // Добавляем имена в HashMap
        for (String name : namesToAdd) {
            counter.addName(name);
        }

        // Выводим количество вхождений имен
        counter.showNamesOccurrences();
    }
}

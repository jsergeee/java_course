import java.util.ArrayList;
import java.util.Arrays;

public class Task5 {

    // Исправленный метод removeEvenNumbers возвращает список с нечетными числами
    public static ArrayList<Integer> removeEvenNumbers(Integer[] arr) {
        ArrayList<Integer> result = new ArrayList<>();
        for (Integer num : arr) {
            if (num % 2 != 0) {
                result.add(num);
            }
        }
        return result;  // Теперь метод возвращает результат
    }

    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(removeEvenNumbers(arr));  // Печатает отфильтрованный список нечетных чисел
    }

    public static class Printer {
        public static void main(String[] args) {
            Integer[] arr;

            if (args.length == 0) {
                // При отправке кода на выполнение, вы можете варьировать эти параметры
                arr = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
            } else {
                arr = Arrays.stream(args[0].split(", "))
                        .map(Integer::parseInt)
                        .toArray(Integer[]::new);
            }

            // Используем метод из класса Task5
            System.out.println(Task5.removeEvenNumbers(arr));
        }
    }
}

import java.util.Arrays;
import java.util.Collections;

public class Task5_1 {
    public static void analyzeNumbers(Integer[] arr) {
        if (arr == null || arr.length == 0) {
            System.out.println("Массив пуст или не задан.");
            return;
        }

        // Находим максимальное и минимальное значение
        int max = Collections.max(Arrays.asList(arr));
        int min = Collections.min(Arrays.asList(arr));

        // Вычисляем среднее значение
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        double average = (double) sum / arr.length;

        // Сортируем массив
        Arrays.sort(arr);

//        // Подсчитываем количество четных и нечетных чисел
//        int evenCount = 0;
//        int oddCount = 0;
//        for (int num : arr) {
//            if (num % 2 == 0) {
//                evenCount++;
//            } else {
//                oddCount++;
//            }
//        }

        // Выводим результаты
        System.out.println("Максимальное значение: " + max);
        System.out.println("Минимальное значение: " + min);
        System.out.println("Среднее значение: " + average);
//        System.out.println("Отсортированный массив: " + Arrays.toString(arr));
//        System.out.println("Количество четных чисел: " + evenCount);
//        System.out.println("Количество нечетных чисел: " + oddCount);
    }

    // Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
    public static void main(String[] args) {
        Integer[] arr;

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            arr = new Integer[]{4, 2, 7, 5, 1, 3, 8, 6, 9};
        } else {
            arr = Arrays.stream(args[0].split(", "))
                    .map(Integer::parseInt)
                    .toArray(Integer[]::new);
        }

        // Вызываем метод analyzeNumbers
        analyzeNumbers(arr);
    }
}

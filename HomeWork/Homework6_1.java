
/*
Сортировка
 */
package HomeWork;

import java.util.ArrayList;
import java.util.Collections;

public class Homework6_1 {
        public static void analyzeNumbers(Integer[] arr) {
            // Создаем список ArrayList и заполняем его числами из массива arr
            ArrayList<Integer> list = new ArrayList<>();
            Collections.addAll(list, arr);

            // Сортируем список по возрастанию
            Collections.sort(list);
            System.out.println(list);

            // Находим минимальное значение в списке
            int min = Collections.min(list);
            System.out.println("Minimum is " + min);

            // Находим максимальное значение в списке
            int max = Collections.max(list);
            System.out.println("Maximum is " + max);

            // Находим среднее арифметическое значений списка
            double average = list.stream().mapToInt(Integer::intValue).average().orElse(0.0);
            System.out.println("Average is " + average);
        }

        public static void main(String[] args) {
            Integer[] array = {4, 2, 7, 5, 1, 3, 8, 6, 9};
            analyzeNumbers(array);
        }
}



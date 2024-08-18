package HomeWork.ArreyTask;

import java.util.ArrayList;

public class Answer {
    public static ArrayList<Integer> removeEvenNumbers(Integer[] arr) {
        ArrayList<Integer> result = new ArrayList<>();
        for (Integer num : arr) {
            if (num % 2 != 0) {
                result.add(num);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(removeEvenNumbers(arr));
    }
}


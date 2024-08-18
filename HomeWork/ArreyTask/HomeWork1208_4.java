package HomeWork.ArreyTask;

import java.util.Arrays;

public class HomeWork1208_4 {
    public static void main(String[] args){
        int[] array2 = new int[20];
        for(int i = 0; i <array2.length; i++){
            array2[i] = i + 1;

        }
//        System.out.println(array2[4]);

        String text = "one two three";
        String[] words = text.split(" ");
        System.out.println(Arrays.toString(words));

    }



}

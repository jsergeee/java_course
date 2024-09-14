package HomeWork.ArreyTask;

import java.lang.reflect.Array;

public class HW130924 {

    static class IntArrey{
        private int[] array;
        public IntArrey(int size){
            array = new int[size];
            for (int i = 0; i < array.length; i++){
                array[i] = i +1;
            }
        }

        public void PrintArray(){
            for (int i = 0; i < array.length; i++){
                System.out.println(array[i]);
            }
        }

    }

    public static void main (String[]args){
    IntArrey intArrey = new IntArrey(20);
    intArrey.PrintArray();


    }


}

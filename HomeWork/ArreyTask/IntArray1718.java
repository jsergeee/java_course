package HomeWork.ArreyTask;

public class IntArray1718 {

    static class IntArray{
        public int[] array;
        public IntArray(int size){
            array = new int[size];
            for(int i=0;i< array.length;i++){
                array[i] = i +1;
            }

        }
        public void PrintArray(){
            for(int i=0;i< array.length;i++){
                System.out.println(array[i]);
            }
        }
    }
    public static void main(String[] args){
        IntArray intArray = new IntArray(10);
        intArray.PrintArray();
    }
}



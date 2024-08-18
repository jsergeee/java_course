package HomeWork.ArreyTask;

public class HomeWork1208_3 {

    static class IntegerArray{

        static int[] arrayA;

        public IntegerArray(int size){
            arrayA = new int[size];
            for(int i = 0; i < arrayA.length;i++){
                arrayA[i] = i + 1;
            }
        }
        public void printArray(){
            for(int i = 0; i < arrayA.length;i++){
                System.out.println(arrayA[i]);
            }
        }
    }
    public static void main(String[] args){
        IntegerArray inegerArray = new IntegerArray(20);
        inegerArray.printArray();
    }
}

public class HomeWork1308_1 {
   static class IntArray{
       private int[] array;
       public IntArray (int size){
           array = new int[size];
           for(int i = 0; i < array.length; i++){
               array[i] = i + 1;
           }

       }
       public void PrintArr(){
           for(int i = 0; i < array.length; i++){
               System.out.println(array[i]);
           }
       }
   }


    public static void main(String[] args){
    IntArray intArray = new IntArray(15);
    intArray.PrintArr();
    }
}

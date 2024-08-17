public class HW1708 {
    static class IntArray{
        public int array[];
        public IntArray(int size){
            array = new int[size];
            for (int i = 0;i< array.length;i++){
              array[i] = i + 1;
            }

        }
        public void PrintArray(){
            for (int i = 0;i < array.length;i++) {
                if(array[i] %2 == 0){
                    System.out.println("Чёт: " + array[i]);
                }
               else System.out.println("нечет: " + array[i]);
            }
        }
    }
    public static void main(String[] args){
        IntArray intArray = new IntArray(10);
        intArray.PrintArray();
    }


}

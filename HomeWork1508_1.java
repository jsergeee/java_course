public class HomeWork1508_1 {
    static class IntDobArray{
        private int[][] array;
        public IntDobArray(int size1, int size2){
        array = new int[size1][size2];
        for(int i = 0; i < array.length;i++){
            for(int j = 0; j < array[i].length;j++){
                array[i][j] = (i+10)*(j+10);
            }
        }
        }
        public void PrintArray(){
            for(int i =0; i < array.length;i++){
                for(int j = 0; j < array[i].length;j++){
                    System.out.print(array[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args){
        IntDobArray intDobArray = new IntDobArray(10, 5);
        intDobArray.PrintArray();


    }
}

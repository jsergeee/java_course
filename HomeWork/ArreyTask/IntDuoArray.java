package HomeWork.ArreyTask;

public class IntDuoArray {
    static class IntArray{
        public int[][] array;
        public IntArray(int size1, int size2){
            array = new int[size1][size2];
            for(int i = 0; i < array.length;i++){
                for(int j = 0;j < array[i].length;j++){
                    array[i][j] = (i + 2 ) * (j + 2);
                }
            }

        }

        public void PrintArray() {
            for(int i = 0; i < array.length; i++){
                for(int j = 0; j < array[i].length; j++){
                    System.out.print(array[i][j] + " ");
                }
                System.out.println();
            }

        }
    }
    public static void main (String[] args){
        IntArray intDuoArray = new IntArray(10, 10);
        intDuoArray.PrintArray();
    }
}

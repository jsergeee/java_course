package HomeWork.ArreyTask;

public class HomeWork1508 {
    public static void main(String[] args){
        int[][]array = new int[5][5];
        for(int i=0; i< array.length;i++){
            for(int j=0; j < array[i].length;j++){
                array[i][j] = (i + 1) * (j + 1);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

    }

}

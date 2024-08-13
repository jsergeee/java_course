public class HomeWork1308 {
    public static void main(String[]args){
        int[][] mass = new int[5][6];
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                mass[i][j] = (i + 1) * (j + 1);
                System.out.print(mass[i][j] + " ");
            }
            System.out.println();
        }

    }
}

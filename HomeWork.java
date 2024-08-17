public class HomeWork {
    static class IntrgerArrey{

        private int[] array;
        public IntrgerArrey(int size){
            array = new int[size];
                for(int i = 0; i < array.length; i++){
                    array[i] = i + 1;
                }

        }
        public void PrintArray(){
            for(int i = 0; i < array.length; i++)
                System.out.println(array[i]);
        }

    }
    public static void main(String [] args){
        IntrgerArrey intrgerArrey = new IntrgerArrey(20);
        intrgerArrey.PrintArray();
    }
}

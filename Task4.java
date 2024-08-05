public class Task4 {




    public static void main (String[] args){
        foo();
        task1(2);


    }

    private static void foo() {
    }

    public static void task1(int n){
        String c1 = "c1";
        String c2 = "c2";



        StringBuilder result = new StringBuilder();
        int k = n * 2;

        for (int i = 0; i < k; i++){
            result.append(c1);
            result.append(c2);
        }
        System.out.println(result.length() / 4);
    }












}



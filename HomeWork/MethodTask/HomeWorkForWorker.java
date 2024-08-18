package HomeWork.MethodTask;

public class HomeWorkForWorker {

    static int count = 0;
    static String jobn = "Работа: ";
    public static void main (String[] args){
        Worker a = new Worker();
        a.age = 20;
        Worker ivanov;
        a.name = "Ivanova";
        a.job = "MegaFon";
        a.address = "Mira, 20";
        count++;

        Worker b = new Worker();
        b.age = 20;
        b.name = "Petrov";
        b.job = "MegaFon";
        b.address = "Mira, 20";
        count++;

        System.out.println(jobn + a.name + " Возраст: " + a.age + " Работа: " + a.job);
        System.out.println("Имя: " + b.name + " Возраст: " + b.age + " Работа: " + b.job);
        System.out.println("Колич-во: "+ count);

        // В классе Worker создали методы печати public void PrintA() и public void PrintB()
//        b.PrintA();
//        b.PrintB();
    }

}

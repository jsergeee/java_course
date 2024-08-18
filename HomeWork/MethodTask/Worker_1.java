package HomeWork.MethodTask;

public class Worker_1 {
    static int count;
    static String job;
    public static void main(String[] args){
        Worker_ a = new Worker_();
        a.age = 20;
        Worker_ ivanov;
        a.name = "Ivanova";
        a.job = "MegaFon";
        a.adress = "Mira, 20";
        count++;

        Worker_ b = new Worker_();
        b.age = 20;

        b.name = "Petrov";
        b.job = "MegaFon";
        b.adress = "Mira, 20";
        count++;

        System.out.println(job + a.name + " Возраст: " + a.age + " Работа: " + a.job);
        System.out.println("Имя: " + b.name + " Возраст: " + b.age + " Работа: " + b.job);
        System.out.println("Колич-во: "+ count);
    }
}

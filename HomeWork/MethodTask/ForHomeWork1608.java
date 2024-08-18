package HomeWork.MethodTask;

public class ForHomeWork1608 {
    String first_name;
    String adress;
    String work;
    int age;
    int weight;
    public ForHomeWork1608(String first_name, String adress, String work, int age, int weight){
        this.first_name = first_name;
        this.adress = adress;
        this.work = work;
        this.age = age;
        this.weight = weight;
    }
    public static void main(String[]args){
        ForHomeWork1608 a = new ForHomeWork1608("ivan", "Ekat", "Lenta", 50, 150);
        System.out.println(a.first_name);
        System.out.println(a.adress);
        System.out.println(a.work);
        System.out.println(a.weight);
    }
}

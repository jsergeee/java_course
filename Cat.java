//Конструктор по умочанию

public class Cat {
    String name;
    int age;

    public Cat() {
        System.out.println("Создали кота2");
    }

    public static void main(String[] args) {
        Cat a = new Cat();
        a.name = "Barsik";
        a.age = 10;

        Cat b = new Cat(); //вот здесь сработал конструктор по умолчанию
        System.out.println(a.name);
    }
}

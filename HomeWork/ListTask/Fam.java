
/*
Это от GPT
 */
package HomeWork.ListTask;

import java.util.ArrayList;
import java.util.List;

public class Fam {
    private String name;
    private String last_name;
    private int age;
    private String work;

    // Конструктор
    public Fam(String name, String last_name, int age, String work) {
        this.name = name;
        this.last_name = last_name;
        this.age = age;
        this.work = work;
    }

    // Геттеры для удобства вывода информации
    public String getName() {
        return name;
    }

    public String getLastName() {
        return last_name;
    }

    public int getAge() {
        return age;
    }

    public String getWork() {
        return work;
    }

    @Override
    public String toString() {
        return "Fam{" +
                "name='" + name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", age=" + age +
                ", work='" + work + '\'' +
                '}';
    }

    public static void main(String[] args) {
        // Создаем список объектов Fam
        List<Fam> list = new ArrayList<>();

        // Добавляем объекты в список
        list.add(new Fam("John", "Doe", 30, "Engineer"));
        list.add(new Fam("Jane", "Smith", 25, "Doctor"));
        list.add(new Fam("Emily", "Jones", 28, "Artist"));

        // Выводим информацию об объектах списка с порядковыми номерами
        for (int i = 0; i < list.size(); i++) {
            Fam person = list.get(i);
            System.out.println("№" + (i + 1) + ": " + person);
        }
    }
}

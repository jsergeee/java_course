import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

public class task2 {
    public static void main (String[] args){
        System.out.println("Введите свое имя:");
//        String name = new Scanner(System.in).next(); // Я не понял зачам он это вообще писал и сказа закоментировать
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
//        System.out.println("Ваше имя " + name);  // Для примера считывание а вывод данных от пользователя
        LocalDateTime now = LocalDateTime.now();
        if(now.isBefore(LocalDateTime.of(LocalDate.now(), LocalTime.of(16, 0)))){
            System.out.println("Good day, " + name + "!");

        }else if(now.isAfter(LocalDateTime.of(LocalDate.now(), LocalTime.of(16, 0)))){
            System.out.println("Good evening, " + name + "!");
        }


    }



}

package OOP.Home_Work.Final_work;

import java.util.Scanner;

public class ConsoleIO {
    private final Scanner scanner;

    public ConsoleIO() {
        this.scanner = new Scanner(System.in);
    }

    public ComplexNumber readComplexNumber() {
        System.out.print("Введите действительное число: ");
        double real = scanner.nextDouble();
        System.out.print("Введите мнимое число: ");
        double imaginary = scanner.nextDouble();
        return new ComplexNumber(real, imaginary);
    }

    public String readOperation() {
        System.out.print("Введите арифметическое дейсвие(+, *, /): ");
        return scanner.next();
    }

    public void printResult(ComplexNumber result) {
        System.out.println("Результат: " + result);
    }
}

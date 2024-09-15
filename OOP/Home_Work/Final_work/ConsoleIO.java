package OOP.Home_Work.Final_work;

import java.util.Scanner;

public class ConsoleIO {
    private final Scanner scanner;

    public ConsoleIO() {
        this.scanner = new Scanner(System.in);
    }

    public ComplexNumber readComplexNumber() {
        System.out.print("Enter real part: ");
        double real = scanner.nextDouble();
        System.out.print("Enter imaginary part: ");
        double imaginary = scanner.nextDouble();
        return new ComplexNumber(real, imaginary);
    }

    public String readOperation() {
        System.out.print("Enter operation (add/multiply/divide): ");
        return scanner.next();
    }

    public void printResult(ComplexNumber result) {
        System.out.println("Result: " + result);
    }
}

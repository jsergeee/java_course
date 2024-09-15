package OOP.Home_Work.Final_work;

public class ComplexCalculator {
    public static void main(String[] args) {
        ConsoleIO consoleIO = new ConsoleIO();
        ComplexOperationFactory factory = new ComplexOperationFactory();

        // Ввод комплексных чисел
        ComplexNumber a = consoleIO.readComplexNumber();
        ComplexNumber b = consoleIO.readComplexNumber();

        // Ввод операции
        String operationType = consoleIO.readOperation();

        // Создание нужной операции через фабрику
        ComplexOperation operation = factory.createOperation(operationType);

        // Выполнение операции
        ComplexNumber result = operation.execute(a, b);

        // Вывод результата
        consoleIO.printResult(result);
    }
}

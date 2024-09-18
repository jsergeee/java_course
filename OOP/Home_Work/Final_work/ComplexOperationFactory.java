package OOP.Home_Work.Final_work;

public class ComplexOperationFactory {
    public ComplexOperation createOperation(String type) {
        return switch (type) {
            case "плюс", "+" -> new ComplexOperationLoggingProxy(new AdditionOperation());
            case "умножить", "*" -> new ComplexOperationLoggingProxy(new MultiplicationOperation());
            case "делить", "/" -> new ComplexOperationLoggingProxy(new DivisionOperation());
            default -> throw new IllegalArgumentException("Недопустимое действие: " + type);
        };
    }
}
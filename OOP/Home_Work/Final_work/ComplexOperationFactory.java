package OOP.Home_Work.Final_work;

public class ComplexOperationFactory {
    public ComplexOperation createOperation(String type) {
        return switch (type) {
            case "add", "+" -> new ComplexOperationLoggingProxy(new AdditionOperation());
            case "multiply", "*" -> new ComplexOperationLoggingProxy(new MultiplicationOperation());
            case "divide", "/" -> new ComplexOperationLoggingProxy(new DivisionOperation());
            default -> throw new IllegalArgumentException("Unknown operation type: " + type);
        };
    }
}
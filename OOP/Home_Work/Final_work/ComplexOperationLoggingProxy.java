package OOP.Home_Work.Final_work;

import java.util.logging.Logger;

public class ComplexOperationLoggingProxy implements ComplexOperation {
    private final ComplexOperation operation;
    private static final Logger logger = Logger.getLogger(ComplexOperationLoggingProxy.class.getName());

    public ComplexOperationLoggingProxy(ComplexOperation operation) {
        this.operation = operation;
    }

    @Override
    public ComplexNumber execute(ComplexNumber a, ComplexNumber b) {
        logger.info("Произведенная операция: " + operation.getClass().getSimpleName());
        logger.info("Произведенное действие: " + a + ", " + b);
        ComplexNumber result = operation.execute(a, b);
        logger.info("Результат: " + result);
        return result;
    }
}
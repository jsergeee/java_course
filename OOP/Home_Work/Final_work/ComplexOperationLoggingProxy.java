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
        logger.info("Executing operation: " + operation.getClass().getSimpleName());
        logger.info("Operands: " + a + ", " + b);
        ComplexNumber result = operation.execute(a, b);
        logger.info("Result: " + result);
        return result;
    }
}
package OOP.Home_Work.Final_work;

public class DivisionOperation implements ComplexOperation {
    @Override
    public ComplexNumber execute(ComplexNumber a, ComplexNumber b) {
        double denominator = b.getReal() * b.getReal() + b.getImaginary() * b.getImaginary();
        if (denominator == 0) {
            throw new ArithmeticException("Division by zero");
        }
        double realPart = (a.getReal() * b.getReal() + a.getImaginary() * b.getImaginary()) / denominator;
        double imaginaryPart = (a.getImaginary() * b.getReal() - a.getReal() * b.getImaginary()) / denominator;
        return new ComplexNumber(realPart, imaginaryPart);
    }
}
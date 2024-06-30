package homework_7.calculator;

import homework_7.complex.Complex;

public class CalculableFactory implements ICalculableFactory{
    @Override
    public Calculable create(Complex firstArg) {
        return new Calculator(firstArg);
    }
}

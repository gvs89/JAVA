package homework_7.calculator;

import homework_7.complex.Complex;

public interface ICalculableFactory {
    Calculable create(Complex firstArg);
}

package dz_1;
//Реализуйте простой калькулятор

//В методе calculate класса Calculator реализовать калькулятор, который будет выполнять математические //операции (+, -, *, /) над двумя целыми числами и возвращать результат вещественного типа.

//В классе Printer необходимо реализовать проверку переданного оператора, при некорректном операторе программа должна вывести сообщение об ошибке "Некорректный оператор: 'оператор'".

class Calculator {
    public double calculate(char op, int a, int b) {
        // Введите свое решение ниже
        double result = 0;
        switch (op) {
            case '+':
                result = add(a, b);
                break;
            case '-':
                result = minus(a, b);
                break;
            case '*':
                result = mult(a, b);
                break;
            case '/':
                result = divide(a, b);
                break;
        }
        return result;
    }

    private double divide(int a, int b) {
        if (b != 0)
            return (double) a / b;
        return -1;
    }

    private int mult(int a, int b) {
        return a * b;
    }

    private int minus(int a, int b) {
        return a - b;
    }

    private int add(int a, int b) {
        return a + b;
    }
}

// Не удаляйте этот класс!
// Он нужен для вывода результатов на экран и проверки

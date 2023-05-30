package application;

public class Calculator {

    //***************Simple methods************************

    public int add(int a, int b) {
        return a + b;
    }

    public int multiplication(int a, int b) {
        return a * b;
    }

    public int subtraction(int a, int b) {
        return a - b;
    }

    public int division(int a, int b) {
        return a / b;
    }

    public double squareRoot(double a) {
        return Math.sqrt(a);
    }

    public double theSquare(double a) {
        return Math.pow(a, 2);
    }

    public double averageValue(double a, double b, double c) {
        return (a + b + c) / 3;
    }

    public boolean evenOdd(int a) {
        return a % 2 == 0;
    }

    public int biggestValue(int a, int b) {
        if (a == b) {
            return 0;
        } else if (a > b) {
            return a;
        }
        return b;
    }
    public int addParametrs(int ... parametrs) {
        int sum = 0;
        for (int i = 0; i < parametrs.length; i++) {
            sum+=parametrs[i];
        }
        return sum;
    }
    public int divisionByZero(int a, int b) {
        if (b!=0){
            return a / b;
        }
        return -100;
    }


    //TODO add method for subtraction

    //TODO add method for multiplication

    //TODO add method for division

    //TODO add method for square root (use Math class)

    //TODO add method for x^2

    //***************Medium methods************************

    //TODO (*) |average value| add method which calculate average value of 3 numbers

    //TODO (*) |even or odd| add method which get 1 number as parameter and return true if it even, and false - if odd

    //TODO (*) |biggest value| add method which get 2 number as parameters and return bigger of them, or 0 if they equals

    //***************Hard methods************************

    //TODO (**) |addition with multiple parameters| add method which return sum of any quantity of parameter

    //TODO (*) |divide by zero case| add method for division (check division by zero case
    // - if we try to divide by zero - return -100;


}








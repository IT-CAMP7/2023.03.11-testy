package pl.camp.it.testy;

public class Calculator {

    public Calculator() {
        System.out.println("Konstruktor kalkulatora !!");
    }

    public int add(int a, int b) {
        if((a > 0 && b > 0 && a+b < 0) || (a < 0 && b < 0 && a+b >= 0)) {
            throw new TooBigArgumentsException();
        }
        return a+b;
    }

    public int multiply(int a, int b) {
        return a*b;
    }

    public double divide(int a, int b) {
        if(b == 0) {
            throw new DivideByZeroException();
        }
        return ((double) a) / ((double) b);
    }
}

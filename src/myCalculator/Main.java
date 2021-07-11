package myCalculator;

public class Main {
    public static void main(String[] args) {

        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1,1); // получим 0
        int c = calc.divide.apply(a, b); // делим на ноль.


        calc.println.accept(c);
        calc.println.accept(calc.multiply.apply(45, 56));
        calc.println.accept(calc.pow.apply(8));
        calc.println.accept(calc.abs.apply(-100));

        calc.println.accept(calc.isPositive.test(-56) ? 1 : 0);

    }
}

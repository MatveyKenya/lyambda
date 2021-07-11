package myCalculator;

import java.util.function.*;

public class Calculator {

    //данной переменной можно будет получить экземпляр класса Calculator
    static Supplier<Calculator> instance = Calculator::new;

    //несколько переменных типа BinaryOperator для математических операций над двумя числами.
    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;
    //деление на ноль вызывает ошибку поэтому выполним проверку знаменателя на ноль
    //и в случае если =0 можно выдать ошибку или подставить свое безопасное значение (допустим 0)
    BinaryOperator<Integer> divide = (x, y) -> y != 0 ? x / y : 0;

    // несколько переменных типа UnaryOperator для произведения математических операций над одним числом:
    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;

    //переменная типа Predicate для определения положительное ли число:
    Predicate<Integer> isPositive = x -> x > 0;

    //переменная типа Consumer для вывода числа в консоль. ссылка на статический метод println():
    Consumer<Integer> println = System.out::println;
}

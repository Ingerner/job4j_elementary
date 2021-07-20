package ru.job4j.calculator;
import ru.job4j.math.*;

import static ru.job4j.math.MathFunction.*;
public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return  sum(first, second)
                + multiply(first, second);
        /*return  ru.job4j.math.MathFunction.sum(first, second)
                + ru.job4j.math.MathFunction.multiply(first, second);*/
    }

    public static double sumTooOperetions(double first, double second) {
       return difference(first, second)
               + division(first, second);
    }

    public static double sumFourOperetions(double first, double second) {
        return sum(first, second)
                + multiply(first, second)
                + difference(first, second)
                + division(first, second);
    }

    public static void  main(String[] args) {
        System.out.println("Результат расчета sumAndMultiply равен:"  + sumAndMultiply(10, 20));
        System.out.println("Результат расчета sumTooOperetions равен:" + sumTooOperetions(10, 20));
        System.out.println("Результат расчета sumFourOperetions равен:" + sumFourOperetions(10, 20));
    }
}

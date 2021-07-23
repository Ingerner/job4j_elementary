package ru.job4j.condition;

public class LogicNot {
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static boolean isPossitiv(int num) {
        return num > 0;
    }

    public static  boolean notEven(int num) {
        return !isEven(num);
    }

    public  static  boolean notPossitiv(int num) {
        return !isPossitiv(num);
    }

    public static boolean notEvenAndPositive(int num) {
        return !isEven(num) && isPossitiv(num);
    }

    public static boolean evenORNotPossitive(int num) {
        return isEven(num) || !isPossitiv(num);
    }
}

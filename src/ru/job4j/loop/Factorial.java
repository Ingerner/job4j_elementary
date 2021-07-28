package ru.job4j.loop;

public class Factorial {
    public static int calc(int n) {
        if (n > 0) {
            int result = 1;
            for (int i = 1; i <= n; i++) {
                result = result * i;
            }
            return result;
        }
        return 1;
    }
}

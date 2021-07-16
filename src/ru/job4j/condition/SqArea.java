package ru.job4j.condition;

public class SqArea {
    public static double square(double p, double k) {
        double h = p / ( 2*(k+1) );
        double L = h * k;


        return  L * h;
    }

    public static void main(String[] args) {
        double result1 = SqArea.square(6, 2);
        System.out.println(" p = 6, k = 6, s = 2, real = " + result1);
    }
}

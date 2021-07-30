package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, double salary, double percent) {
        int year = 1;
        amount = amount + (amount * percent / 100);
        while (amount > salary) {
            amount =   (amount + (amount * percent / 100)) - salary;
            year += 1;
        }
        return year;
    }
}

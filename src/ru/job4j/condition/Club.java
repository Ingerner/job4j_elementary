package ru.job4j.condition;

public class Club {
    public static void permissio(boolean hasMoney, boolean beFriend) {
        if (hasMoney || beFriend) {
            System.out.println("I can go to the club.");
        } else {
            System.out.println("Ican't.");
        }
    }

    public  static void main(String[] args) {
        permissio(true, true);
        permissio(true, false);
        permissio(false, true);
        permissio(false, false);

    }
}

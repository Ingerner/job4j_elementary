package ru.job4j.array;

public class Square {
    public static int[] calculate(int boud) {
        int[] rst = new int[boud];
        for (int number = 0; number < boud; number++) {
            rst[number] = (int) Math.pow(number, 2);
        }
            return rst;
    }

    public static void main(String[] args) {
        int[] array = calculate(4);
        for (int index = 0; index < array.length; index++) {
         System.out.println(array[index]);
        }
    }
}


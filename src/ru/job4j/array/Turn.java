package ru.job4j.array;

public class Turn {
    public static  int[] back(int[] array) {
        int temp;
        for (int index = 0; index < array.length; index++) {
            temp = array[index];
            array[index] = array[array.length - 1];
            array[array.length - index - 1] = temp;
        }
        return array;
    }
}

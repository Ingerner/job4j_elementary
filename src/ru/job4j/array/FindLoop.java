package ru.job4j.array;

public class FindLoop {
    public static int indexOf(int[] data, int el) {

        for (int index = 0; index < data.length; index++) {
            if (data[index] == el) {
                return index;
            }
        }
        return -1;
    }
}

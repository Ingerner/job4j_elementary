package ru.job4j.array;

public class SortSelected {
    public static  int[] sort(int[] data) {
        for (int number = 0; number < data.length; number++) {
            int min = MinDiapason.findMin(data, number, data.length - 1);
            int index = FindLoop.indexOf(data, min, number, data.length - 1);
            SwitchArray.swap(data, number, index);
        }
        return data;
    }
}

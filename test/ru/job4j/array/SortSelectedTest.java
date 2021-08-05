package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortSelectedTest {

    @Test
    public void whenSort() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void when3number() {
        int[] data = new int[] {3, 1, 4};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 3, 4};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void when4number() {
        int[] data = new int[] {7, 5, 9, 8, 3};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {3, 5, 7, 8, 9};
        Assert.assertArrayEquals(expected, result);
    }
}
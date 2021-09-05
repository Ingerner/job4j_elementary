package ru.job4j.ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenMax3ToThen3() {
        int left = 3;
        int right = 1;
        int result = Max.max(left, right);
        int expected = 3;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenMax1ToThen1() {
        int left = 1;
        int right = 1;
        int result = Max.max(left, right);
        int expected = 1;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testMax() {
        int first = 1;
        int second = 1;
        int third = 2;
        int result = Max.max(first, Max.max(second, third));
        int expected = 2;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testMax1() {
            int first  = 1;
            int second = 2;
            int third  = 3;
            int fourth = 4;
            int result = Max.max(Max.max(first, second), Max.max(third, fourth));
            int expected = 4;
            Assert.assertEquals(expected, result);
    }
}
package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SqAreaTest {

    @Test
    public void whenP6K2Sqarea2() {
        int p = 6;
        int k = 2;
        int expected = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP2K1Sqarea025() {
        int p = 2;
        int k = 1;
        double expected = 0.25;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP10K5Sqarea347() {
        int p = 10;
        int k = 5;
        double expected = 3.47;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
}
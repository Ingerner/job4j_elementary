package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest {

    @Test
    public void whenCalculateFactorialForFiveThenOneHundredTwenty() {
        int in = 5;
        int expected = 120;
        int resultat = Factorial.calc(in);
        Assert.assertEquals(expected, resultat);
        /* напишите здесь тест, проверяющий, что факториал для числа 5 равен 120. */
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int in = 0;
        int expected = 1;
        int resultat = Factorial.calc(in);
        Assert.assertEquals(expected, resultat);
        /* напишите здесь тест, проверяющий, что факториал для числа 0 равен 1. */

    }
}
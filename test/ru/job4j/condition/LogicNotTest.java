package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;
import static ru.job4j.condition.LogicNot.*;

public class LogicNotTest {

    @Test
    public void when2ThenTru() {
        int in = 2;
        boolean expected = true;
        boolean resultat = isEven(in);
        Assert.assertEquals(expected, resultat);
    }

    @Test
    public void whenMinus1ThenFalse() {
        int in = -1;
        boolean expected = false;
        boolean resultat = isPossitiv(in);
        Assert.assertEquals(expected, resultat);
    }

    @Test
    public void when2ThenTrue() {
        int in = 3;
        boolean expected = true;
        boolean resultat = notEven(in);
        Assert.assertEquals(expected, resultat);
    }

    @Test
    public void whenMinus1ThenTrue() {
        int in = -1;
        boolean expected = true;
        boolean resultat = notPossitiv(in);
        Assert.assertEquals(expected, resultat);

    }

    @Test
    public void whenMinus2ThenFalse() {
        int in = -3;
        boolean expected = false;
        boolean resultat = notEvenAndPositive(in);
        Assert.assertEquals(expected, resultat);
    }

    @Test
    public void  when4ThenTrue() {
        int in = 4;
        boolean expected = true;
        boolean resultat = evenORNotPossitive(in);
        Assert.assertEquals(expected, resultat);

    }
}
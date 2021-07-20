package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when00To20Then2() {
        /* входные данные*/
        int x1 = 0;
        int x2 = 0;
        int y1 = 2;
        int y2 = 0;
        /* ожидаемый результат*/
        double expected = 2;
        /* возвращаемый результат*/
        double out= Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);

    }
    @Test
    public void when22To10Then1() {
        /* входные данные*/
        int x1 = 2;
        int x2 = 2;
        int y1 = 1;
        int y2 = 0;
        /* ожидаемый результат*/
        double expected = 1;
        /* возвращаемый результат*/
        double out= Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);

    }
    @Test
    public void when13To15Then447() {
        /* входные данные*/
        int x1 = 1;
        int x2 = 3;
        int y1 = 1;
        int y2 = 5;
        /* ожидаемый результат*/
        double expected = 4.47;
        /* возвращаемый результат*/
        double out= Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);

    }
    @Test
    public void when52To03Then424() {
        /* входные данные*/
        int x1 = 5;
        int x2 = 2;
        int y1 = 0;
        int y2 = 3;
        /* ожидаемый результат*/
        double expected = 4.24;
        /* возвращаемый результат*/
        double out= Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);

    }
}
package ru.job4j.ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MultipleSwitchWeekTest {

    @Test
    public void numberOfDay1() {
        String  in = "Monday";
        int expected = 1;
        int result = MultipleSwitchWeek.numberOfDay(in);
        Assert.assertEquals(expected, result);

    }
}
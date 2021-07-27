package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SwitchWeekTest {

    @Test
    public void choosingTheDay1() {
        int day = 1;
        String expecteed = "Понедельник";
        String result = SwitchWeek.nameOfDay(day);
        Assert.assertEquals(expecteed, result);

    }

    @Test
    public void choosingTheDay3() {
        int day = 3;
        String expecteed = "Среда";
        String result = SwitchWeek.nameOfDay(day);
        Assert.assertEquals(expecteed, result);

    }

    @Test
    public void choosingTheDay9() {
        int day = 9;
        String expecteed = "Ошибка";
        String result = SwitchWeek.nameOfDay(day);
        Assert.assertEquals(expecteed, result);

    }
}
package ru.job4j.calculator;

import org.junit.jupiter.api.*;

import static org.assertj.core.api.Assertions.*;

class JunitExampleTest {

    @Test
    void when5and5then25() {
        JUnitExample example = new JUnitExample();
        int result = example.multiply(5,5);
        assertThat(result).isEqualTo(25);
    }
    @RepeatedTest(2)
    void when5and5then36() {
        JUnitExample example = new JUnitExample();
        int result = example.multiply(6,6);
        assertThat(result).isEqualTo(36);
    }

    @Test
    @DisplayName("When 5 multi 5 should be 25")
    void when7and5then49() {
        JUnitExample example = new JUnitExample();
        int result = example.multiply(7,7);
        assertThat(result).isEqualTo(49);
    }


    @Test
    void when3and3then9() {
        JUnitExample example = new JUnitExample();
        int result = example.multiply(3,3);
        assertThat(result).isEqualTo(9);
    }

    @Timeout(3)
    @Test
    void when2and2then45() throws InterruptedException {
        Thread.sleep(1000);
        JUnitExample example = new JUnitExample();
        int result = example.multiply(2,2);
        assertThat(result).isEqualTo(4);
    }
}
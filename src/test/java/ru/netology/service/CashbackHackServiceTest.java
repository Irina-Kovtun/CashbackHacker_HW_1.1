package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldCalculateRemainFor999() {
        int actual=service.remain(999);
        int expected = 1;
        assertEquals(expected, actual);
    }
    @Test
    public void shouldCalculateRemainFor1001() {
        int actual=service.remain(1001);
        int expected = 999;
        assertEquals(expected, actual);
    }
    @Test
    public void shouldCalculateRemainFor1000() {
        int actual=service.remain(1000);
        int expected = 0;
        assertEquals(expected, actual);
    }
}
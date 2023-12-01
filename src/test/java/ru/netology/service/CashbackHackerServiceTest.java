package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackerServiceTest {

    @Test
    public void shouldReturnRemainValue0() {
        CashbackHackerService service = new CashbackHackerService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturnRemainValue444() {
        CashbackHackerService service = new CashbackHackerService();
        int amount = 2556;
        int actual = service.remain(amount);
        int expected = 444;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturnRemainValue888() {
        CashbackHackerService service = new CashbackHackerService();
        int amount = 112;
        int actual = service.remain(amount);
        int expected = 888;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturnRemainValue1000() {
        CashbackHackerService service = new CashbackHackerService();
        int amount = 0;
        int actual = service.remain(amount);
        int expected = 1000;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturnRemainValue() {
        CashbackHackerService service = new CashbackHackerService();
        int amount = -556;
        int actual = service.remain(amount);
        int expected = 1556;
        assertEquals(actual, expected);
    }
}
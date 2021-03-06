package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CashbackHackServiceTest {

    @Test
    void shouldReturnRemain500IfAmount500() {
        CashbackHackService cashbackHackService = new CashbackHackService();

        int actual = 500;
        int expected = cashbackHackService.remain(500);
        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnRemain100IfAmount900() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int actual = 100;
        int expected = cashbackHackService.remain(900);
        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnRemain1IfAmount999() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int actual = 1;
        int expected = cashbackHackService.remain(999);
        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnRemain0IfAmount1000() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int actual = 0;   //bug
        int expected = cashbackHackService.remain(1000);
        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnRemain0IfAmount1001() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int actual = 0; //bug?
        int expected = cashbackHackService.remain(1001);
        assertEquals(expected, actual);
    }
    @Test
    void shouldReturnRemain0IfAmount1500() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int actual = 0; //bug?
        int expected = cashbackHackService.remain(1500);
        assertEquals(expected, actual);
    }
}
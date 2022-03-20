package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTest {

    @Test
    public void shouldReturnRemain500IfAmount500() {
        CashbackHackService cashbackHackService = new CashbackHackService();

        int actual = 500;
        int expected = cashbackHackService.remain(500);
        assertEquals(actual, expected);
    }

    @Test
    void shouldReturnRemain100IfAmount900() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int actual = 100;
        int expected = cashbackHackService.remain(900);
        assertEquals(actual, expected);
    }

    @Test
    void shouldReturnRemain1IfAmount999() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int actual = 1;
        int expected = cashbackHackService.remain(999);
        assertEquals(actual, expected);
    }

    @Test
    void shouldReturnRemain0IfAmount1000() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int actual = 0;   //bug
        int expected = cashbackHackService.remain(1000);
        assertEquals(actual, expected, " If Amount 1000, message must be 0");
    }

    @Test
    void shouldReturnRemain0IfAmount1001() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int actual = 0; //bug?
        int expected = cashbackHackService.remain(1001);
        assertEquals(actual, expected, " If Amount 1001, message must be 0");
    }
    @Test
    void shouldReturnRemain0IfAmount1500() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int actual = 0; //bug?
        int expected = cashbackHackService.remain(1500);
        assertEquals(actual, expected, " If Amount 1500, message must be 0");
    }
}
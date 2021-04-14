package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void remain1001() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1001;
        int actual = service.remain(amount);
        int expected = 999;

        assertEquals(expected, actual);
    }

    @Test
    public void remain1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void remain999() {
        CashbackHackService service = new CashbackHackService();
        int amount = 999;
        int actual = service.remain(amount);
        int expected = 1;

        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void remain10010() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1001;
        int actual = service.remain(amount);
        int expected = 999;

        org.junit.Assert.assertEquals(expected, actual);
    }

    @org.junit.Test
    public void remain10000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;

        org.junit.Assert.assertEquals(expected, actual);
    }

    @org.junit.Test
    public void remain9990() {
        CashbackHackService service = new CashbackHackService();
        int amount = 999;
        int actual = service.remain(amount);
        int expected = 1;

        org.junit.Assert.assertEquals(expected, actual);
    }
}
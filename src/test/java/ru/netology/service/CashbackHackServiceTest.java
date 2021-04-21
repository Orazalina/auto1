package ru.netology.service;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {
//Junit 4//
    @org.junit.Test
    public void remain1001() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1001;
        int actual = service.remain(amount);
        int expected = 999;

        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void remain1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void remain999() {
        CashbackHackService service = new CashbackHackService();
        int amount = 999;
        int actual = service.remain(amount);
        int expected = 1;

        assertEquals(expected, actual);
    }
//Api Junit Jupiter//
    @org.junit.jupiter.api.Test
    public void apiRemain1001() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1001;
        int actual = service.remain(amount);
        int expected = 999;

        org.junit.jupiter.api.Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void apiRemain1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;

        org.junit.jupiter.api.Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void apiRemain999() {
        CashbackHackService service = new CashbackHackService();
        int amount = 999;
        int actual = service.remain(amount);
        int expected = 1;

        org.junit.jupiter.api.Assertions.assertEquals(expected, actual);
    }


}
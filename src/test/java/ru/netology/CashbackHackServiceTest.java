package ru.netology;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    //если заплачено 0 рублей
    @Test
    public void shouldPayedZero(){
        CashbackHackService cashbackHackService = new CashbackHackService();
        int actual = cashbackHackService.remain(0);
        int expected = 1000;
        assertEquals(expected, actual);
    }

    //если заплачено 1000
    @Test
    public void shouldPayedThousand() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int actual = cashbackHackService.remain(1000);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    //если заплачено 500
    public void shouldPayedFiveHundred() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int actual = cashbackHackService.remain(500);
        int expected = 500;
        assertEquals(expected, actual);
    }




}
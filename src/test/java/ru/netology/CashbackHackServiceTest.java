package ru.netology;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {


    //если заплачено 0 рублей
    @Test
    public void shouldPayedZero(){
        CashbackHackService cashbackHackService = new CashbackHackService();
        int actual = cashbackHackService.remain(0);
        int expected = 1000;
        assertEquals(actual, expected);
    }

    //если заплачено 1000
    @Test
    public void shouldPayedThousand() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int actual = cashbackHackService.remain(1000);
        int expected = 0;
        assertEquals(actual, expected);
    }

    @Test
    //если заплачено 500
    public void shouldPayedFiveHundred() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int actual = cashbackHackService.remain(500);
        int expected = 500;
        assertEquals(actual, expected);
    }

}
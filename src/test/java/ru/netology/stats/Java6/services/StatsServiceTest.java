package ru.netology.stats.Java6.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void TestAllSales() {
        StatsService service = new StatsService();
        int[] monthlySalesArray = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 180;
        int actual = service.allSales(monthlySalesArray);

        Assertions.assertEquals(expected,actual);

    }

    @Test
    public void TestAverageSales() {
        StatsService service = new StatsService();
        int[] monthlySalesArray = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 15;
        int actual = service.averageSales(monthlySalesArray);

        Assertions.assertEquals(expected,actual);

    }

    @Test
    public void TestMinSales() {
        StatsService service = new StatsService();
        int[] monthlySalesArray = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 9;
        int actual = service.minSales(monthlySalesArray);

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void TestMaxSales() {
        StatsService service = new StatsService();
        int[] monthlySalesArray = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 8;
        int actual = service.maxSales(monthlySalesArray);

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void TestMonthHighSales() {
        StatsService service = new StatsService();
        int[] monthlySalesArray = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 5;
        int actual = service.monthHighSales(monthlySalesArray);

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void TestMonthLowSales() {
        StatsService service = new StatsService();
        int[] monthlySalesArray = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 5;
        int actual = service.monthLowSales(monthlySalesArray);

        Assertions.assertEquals(expected,actual);
    }
}


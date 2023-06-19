package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    void shouldCalculateTotalSales() {
        StatsService statsService = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = statsService.calculateTotalSales(sales);
        Assertions.assertEquals(180, actual);
    }

    @Test
    void shouldCalculateAverageSales() {
        StatsService statsService = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        double actual = statsService.calculateAverageSales(sales);
        Assertions.assertEquals(15.0, actual);
    }

    @Test
    void shouldFindMaxSalesMonth() {
        StatsService statsService = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = statsService.findMaxSalesMonth(sales);
        Assertions.assertEquals(8, actual);
    }

    @Test
    void shouldFindMinSalesMonth() {
        StatsService statsService = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = statsService.findMinSalesMonth(sales);
        Assertions.assertEquals(9, actual);
    }

    @Test
    void shouldCalculateMonthsBelowAverage() {
        StatsService statsService = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = statsService.calculateMonthsBelowAverage(sales);
        Assertions.assertEquals(5, actual);
    }

    @Test
    void shouldCalculateMonthsAboveAverage() {
        StatsService statsService = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = statsService.calculateMonthsAboveAverage(sales);
        Assertions.assertEquals(5, actual);
    }
}

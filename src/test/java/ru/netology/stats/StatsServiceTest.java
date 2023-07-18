package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test

    public void shouldTotalSales() {
        StatsService service = new StatsService();
        int[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedTotalSales = 180;
        int actualTotalSales = service.totalSales(sale);
        Assertions.assertEquals(expectedTotalSales, actualTotalSales);
    }

    @Test

    public void shouldAverageSalesInMonth() {
        StatsService service = new StatsService();
        int[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedAverageSalesInMonth = 15;
        int actualAverageSalesInMonth = service.averageSalesInMonth(sale);
        Assertions.assertEquals(expectedAverageSalesInMonth, actualAverageSalesInMonth);
    }

    @Test

    public void shouldMaxSaleMonth() {
        StatsService service = new StatsService();
        int[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMaxSaleMonth = 8;
        int actualMaxSaleMonth = service.maxSaleMonth(sale);
        Assertions.assertEquals(expectedMaxSaleMonth, actualMaxSaleMonth);

    }

    @Test

    public void shouldMinSaleMonth() {
        StatsService service = new StatsService();
        int[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMinSaleMonth = 9;
        int actualMinSaleMonth = service.minSaleInMonth(sale);
        Assertions.assertEquals(expectedMinSaleMonth, actualMinSaleMonth);
    }

    @Test

    public void shouldCountMonthLowAverage() {
        StatsService service = new StatsService();
        int[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedCountMonthLowAverage = 5;
        int actualCountMonthLowAverage = service.countMonthLowAverage(sale);
        Assertions.assertEquals(expectedCountMonthLowAverage, actualCountMonthLowAverage);
    }

    @Test

    public void shouldCountMonthHighAverage() {
        StatsService service = new StatsService();
        int[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedCountMonthHighAverage = 5;
        int actualCountMonthHighAverage = service.countMonthHighAverage(sale);
        Assertions.assertEquals(expectedCountMonthHighAverage, actualCountMonthHighAverage);
    }
}

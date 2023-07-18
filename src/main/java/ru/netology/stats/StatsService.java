package ru.netology.stats;

import javax.management.BadBinaryOpValueExpException;

public class StatsService {

    public int totalSales(int[] sale) {
        int sales = 0;
        for (int i = 0; i < sale.length; i++) {
            sales = sales + sale[i];
        }
        return sales;
    }

    public int averageSalesInMonth(int[] sale) {
        int sales = 0;
        for (int i = 0; i < sale.length; i++) {
            sales = sales + sale[i];
        }
        return sales / sale.length;
    }

    public int maxSaleMonth(int[] sale) {
        int maxMonth = 0;
        for (int i = 0; i < sale.length; i++) {
            if (sale[i] >= sale[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int minSaleInMonth(int[] sale) {
        int minMonth = 0;
        for (int i = 0; i < sale.length; i++) {
            if (sale[i] <= sale[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;

    }

    public int countMonthLowAverage(int[] sale) {
        int countMonth = 0;
        for (int i = 0; i < sale.length; i++) {

            if (sale[i] < averageSalesInMonth(sale)) {
                countMonth++;
            }
        }
        return countMonth;
    }

    public int countMonthHighAverage(int[] sale) {
        int countMonth = 0;
        for (int i = 0; i < sale.length; i++) {

            if (sale[i] > averageSalesInMonth(sale)) {
                countMonth++;
            }
        }
        return countMonth;
    }
}
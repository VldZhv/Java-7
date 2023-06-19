package ru.netology.stats;

public class StatsService {
    public int calculateTotalSales(int[] sales) {
        int totalSales = 0;
        for (int sale : sales) {
            totalSales += sale;
        }
        return totalSales;
    }

    public double calculateAverageSales(int[] sales) {
        int totalSales = calculateTotalSales(sales);
        double averageSales = totalSales / sales.length;
        return averageSales;
    }

    public int findMaxSalesMonth(int[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int findMinSalesMonth(int[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int calculateMonthsBelowAverage(int[] sales) {
        double averageSales = calculateAverageSales(sales);
        int monthsBelowAverage = 0;
        for (int sale : sales) {
            if (sale < averageSales) {
                monthsBelowAverage++;
            }
        }
        return monthsBelowAverage;
    }

    public int calculateMonthsAboveAverage(int[] sales) {
        double averageSales = calculateAverageSales(sales);
        int monthsAboveAverage = 0;
        for (int sale : sales) {
            if (sale > averageSales) {
                monthsAboveAverage++;
            }
        }
        return monthsAboveAverage;
    }

}


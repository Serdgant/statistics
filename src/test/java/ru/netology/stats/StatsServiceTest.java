package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {


    @org.junit.jupiter.api.Test
    void shoudMinSales() {                               //минимальная продажа
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.minSales(sales);
        assertEquals(expected, actual);

    }

    @Test
    void ShoudSumOfAllSales() {                                   //сума всех продаж
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = service.sumOfAllSales(sales);
        assertEquals(expected, actual);

    }

    @Test
    void shoudTheAverageAmountOfSalesPerMonth() {                       // средняя сума продаж
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        int actual = service.theAverageAmountOfSalesPerMonth(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouNumberOfMonthsPeakSales() {                          //Количество месяцев пик продаж
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = service.numberOfMonthsPeakSales(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateLowMonthlyAverage() {   //Кол-во месяцев, в продаже было два раза ниже среднего
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.calculateLowMonthlyAverage(sales);
        assertEquals(expected, actual);

    }

    @Test
    void shouldTheNumberOfMonthsOnSaleWasAboveAverage() {     //Кол-во месяцев в продаже было выше среднего
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.TheNumberOfMonthsOnSaleWasAboveAverage(sales);
        assertEquals(expected, actual);

    }
}
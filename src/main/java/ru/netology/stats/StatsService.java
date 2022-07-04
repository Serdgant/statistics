package ru.netology.stats;

public class StatsService {


    public int minSales(int[] sales) {        //минимальная продажа
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (int sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int sumOfAllSales(int[] sales) {        //Сума всех продаж
        int sum = 0;
        for (int sale : sales) {
            sum = sum + sale;
        }
        return sum;
    }

    public int theAverageAmountOfSalesPerMonth(int[] sales) {   //Средняя продажа в месяц
        return sumOfAllSales(sales) / sales.length;
    }


    public int numberOfMonthsPeakSales(int[] sales) {        //Количество месяцев пик продаж
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {

            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;

    }

    public int calculateLowMonthlyAverage(int[] sales) {   //Кол-во месяцев, в продаже было два раза ниже среднего
        int month = 0;
        for (int sale : sales) {
            if (sale > theAverageAmountOfSalesPerMonth(sales)) {
                month = month + 1;
            }
        }
        return month;

    }

    public int TheNumberOfMonthsOnSaleWasAboveAverage(int[] sales) {  //Кол-во месяцев в продаже было выше среднего
        int month = 0;
        for (int sale : sales) {
            if (sale < theAverageAmountOfSalesPerMonth(sales)) {
                month = month + 1;
            }
        }
        return month;
    }

}


package ru.netology.stats.Java6.services;

import java.security.Provider;

public class Main {
    public static void main (String args []){
        StatsService service = new StatsService();

              long[] monthlySalesArray = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};



        System.out.println("1)Сумма всех продаж" + "=" + service.allSales(monthlySalesArray));

        System.out.println("2)средняя сумма продаж за месяц" + "=" + service.averageSales(monthlySalesArray));

        System.out.println("3)Номер месяца с минимальными продажами" + "=" + service.minSales(monthlySalesArray));

        System.out.println("4)номер месяца с пиком продаж" + "=" + service.maxSales(monthlySalesArray));

        System.out.println("5)Количество месяцев с продажами выше среднего" + "=" + service.monthHighSales(monthlySalesArray));

        System.out.println("6)Количество месяцев с продажами ниже среднего" + "=" + service.monthLowSales(monthlySalesArray));
    }
}

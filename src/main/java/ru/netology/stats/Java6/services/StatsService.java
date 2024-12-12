package ru.netology.stats.Java6.services;

public class StatsService {


    public int minSales(int[] sales) {

        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренными ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0; // номер месяца с максимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) { // значит, в рассматриваемом i-м месяце продаж больше
                maxMonth = i; // запомним его как максимальный
            }
        }

        return maxMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }



    public long allSales(int[] sales) {

        long sum = 0;                                  // Сумма все продаж
        for (int i = 0; i < sales.length; i++) {

            sum = sum + sales[i];                     // Складываем все числа нашего массива

        }
        return sum;                                  // Возвращаем сумму всех продаж
    }


    public long averageSales(int[] sales) {

        long sum = allSales(sales);       // Сумма всех продаж// Складываем все числа нашего массива


        sum = sum / sales.length;                  // Делим сумму всех продаж на количесво чисел в нашем массиве
        return sum;
    }



    public long monthLowSales(int[] sales) {

        long sum = averageSales(sales);


        // вычесление среднего значения продаж

        int result = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sum > sales[i]) {
                result += 1;

                // Определяем количество месяцев в которых продажи были ниже средних
            }
        }
        return result;
    }


    public long monthHighSales(int[] sales) {

        long sum = averageSales(sales);

        // вычесление среднего значения продаж

        int result = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sum < sales[i]) {
                result += 1;

                // Определяем количество месяцев в которых продажи были  выше средних

            }
        }
        return result;
    }
}



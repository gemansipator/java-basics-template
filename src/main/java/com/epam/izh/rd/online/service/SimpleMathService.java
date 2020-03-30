package com.epam.izh.rd.online.service;

import com.sun.org.apache.xalan.internal.xsltc.compiler.util.CompareGenerator;

public class SimpleMathService implements MathService {

    /**
     * Метод возвращает 0, если value1 = value2.
     * Метод возвращает -1, если value1 < value2.
     * Метод возвращает 1, если value1 > value2.
     *
     * Например для (-1, -1) метод должен вернуть 0;
     * Например для (-3, -1) метод должен вернуть -1;
     * Например для (3, 1) метод должен вернуть 1;
     */
    @Override
    public int compare(int value1, int value2) {

        if (value1 == value2){
            return 0;
        }
        else if (value1 < value2) {
            return -1;
        }
        else {
            return 1;
        }

    }

    /**
     * Метод возвращает максимальное число из пары.
     * Например для списка (-1, 2) метод должен вернуть 2
     */
    @Override
    public int maxFrom(int value1, int value2) {
        return (Math.max(value1, value2));
    }

    /**
     * Метод возвращает максимальное число из переданного массива.
     * Например для списка {-1, -3, 4, 8, 5, 22, -5} метод должен вернуть 22
     */
    @Override
    public int maxFrom(int[] values) {
        int max = values[0];
        for(int i = 0; i < values.length; i++ ){
            if (values[i] > max);
            max=values[i];
        }
        return max;
    }

    /**
     * Метод возвращает сумму чисел массива.
     * Например для списка {-1, -3, 4, 8, 5, 22, -5} метод должен вернуть 30
     */
    @Override
    public int sum(int[] values) {
        int rr =0;
        for (int i = 0; i < values.length ; i++)
            rr = rr + values[i];

        return rr;
    }

    /**
     * Метод фильтрует массив, оставляя только четные числа.
     * Например для списка {-1, -3, 4, 8, 5, 22, 17} метод должен вернуть {4, 8, 22}
     */
    @Override
    public int[] getEvenDigits(int[] values) {
/*        int [] evenArr = new int [values.length] ;
       int k = 0;
       String arrToStr = "";
       for (int i = 0; i < evenArr.length; i++) {
           for (int j = k; j < values.length; j++) {
               k++;
               if (values [j] % 2 == 0) {
                   evenArr [i] = values [j];
                   break;
               }
           }
           arrToStr = arrToStr + evenArr [i] + "; ";
       }*/
        return values; // НЕ ДОДЕЛАЛ!!!
    }

    /**
     * Метод считает факториал из заданного числа.
     * Например для числа 5 метод должен вернуть 120.
     * Факториал 0 должен быть равен 1.
     */
    @Override
    public long calcFactorial(int initialVal) {
        int result = 1;
        for (int i = 1; i <=initialVal; i ++){
            result = result*i;
        }
        return result;
    }

    /**
     * Метод возвращает число, которе находится на заданной позиции (счет начинается с нуля) в ряду фибоначчи.
     *
     * Ряд фибоначчи - ряд, следующие элементы которого состоят из суммы двух предыдущих.
     * Ряд начинается 0 и 1.
     * Пример 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 ...
     *
     * Для числа 9 метод должен вернуть 34
     * Для числа 0 метод должен вернуть 0
     */
    @Override
    public long calcFibonacci(int number) {
        if (number <= 1) return number;
        int previous = 0, next = 1, sum;
        for (int i = 2; i <= number; i++) {
            sum = previous;
            previous = next;
            next = sum + previous;
        }
        return next;
    }

    /**
     * Метод возвращает отсортированный по возрастанию массив.
     * Например для массива {-1, -3, 4, 8, 5, 22, -5} метод должен вернуть {-5, -3, -1, 4, 5, 8, 22}
     */
    @Override
    public int[] sort(int[] values) {
        boolean isSorted = false;
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < values.length-1; i++) {
                if(values[i] > values[i+1]){
                    isSorted = false;

                    buf = values[i];
                    values[i] = values[i+1];
                    values[i+1] = buf;
                }
            }
        }
        return values;
    }


    /**
     * Метод определяет, является ли заданное число простым.
     * Простое число - число, которое делится только на 1 и на само себя.
     *
     * Например для числа 22 вернется false, а для числа 23 true.
     */
    @Override
    public boolean isPrimary(int number) {
        for ( int i=2; i < number; i++) {
            if ( number%i == 0) {

                return false;
            }
        }
        return true;
    }

    /**
     * Метод возвращает массив, в котором элементы расположены в обратном порядке.
     *
     * Например для массива {-1, -3, 4, 8, 5, 22, -5} метод вернет {-5, 22, 5, 8, 4, -3, -1}
     */
    @Override
    public int[] reverseArray(int[] values) {
        for ( int i = 0, j = values.length - 1; i < j; ++i, --j ) {
            int tmp = values[i];
            values[i] = values[j];
            values[j] = tmp;
        }
        return values;


    }
}


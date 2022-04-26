package ru.skypro;

import java.util.LinkedHashSet;

public class Main {
    public static void main(String[] args) {
        task1(2000);
        task2(0, 2014);
        task3(90);
        task4("aabccddefgghiijjkk");
        task5(new int[]{3, 2, 1, 6, 5});
    }

    //Задание 1
    public static void task1(int year) {
        if (((year % 4 == 0) && (year % 100 != 0)) || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    //Задание 2
    public static void task2(int clientOS, int clientDeviceYear) {
        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 1 & clientDeviceYear < 2015)
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1 & clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    //Задание 3
    public static void task3(int deliveryDistance) {
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: 1");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней: 2");
        }
        if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: 3");
        }
    }

    //Задание 4
    public static void task4(String symbol) {
        for (int i = 0; i < symbol.length() - 1; i++) {
            if (symbol.charAt(i) == symbol.charAt(i + 1))
                System.out.println("Дублируется буква " + (symbol.charAt(i)));
            }
        }
    //Задание 5
    public static void task5(int[] arr) {
        for(int i=arr.length-1; i>=0; i--)
            System.out.print(arr[i]);

}
}







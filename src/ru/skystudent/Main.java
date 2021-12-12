package ru.skystudent;

import org.jetbrains.annotations.NotNull;

import java.time.LocalDate;
import java.util.Arrays;

public class Main {



    public static void main(String[] args) {
        int year = 2021;
        int clientDevice = 1;
        int clientDeviceYear = 2015;
        int deliveryDistance = 95;
        String sortedString = "aabccddefgghiijjkk";
        int sortedStringLength = sortedString.length();
        int[] initialArray = {3, 2, 1, 6, 5};
        checkYear(year);
        installApp(clientDevice, clientDeviceYear);
        calculateDeliveryDate(deliveryDistance);
        checkDoubles(sortedString, sortedStringLength);
        revertArray(initialArray);
    }


    //Задание 1
    public static void checkYear(int year){
        if (((year % 4 == 0) && (year % 100 != 0)) || ((year % 4 == 0) && (year % 400 == 0))) {
            System.out.println(year + " - високосный год");
        } else {
            System.out.println(year + " - не високосный год");
        }
    }
    //Задание 2
    public static void installApp(int clientDevice, int clientDeviceYear){
        int currentYear = LocalDate.now().getYear();
        if (clientDeviceYear >= currentYear && clientDevice == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");}
        if (clientDeviceYear >= currentYear && clientDevice == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        if (clientDeviceYear < currentYear && clientDevice == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        if (clientDeviceYear < currentYear && clientDevice == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }
    //Задание 3
    public static void calculateDeliveryDate(int deliveryDistance){
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: " + "1");
        }
        if ((deliveryDistance >= 20) && (deliveryDistance < 60)) {
            System.out.println("Потребуется дней: " + "2");
        }
        if ((deliveryDistance >= 60) && (deliveryDistance < 100)) {
            System.out.println("Потребуется дней: " + "3");
        }
    }
    // Задание 4
    public static void checkDoubles(@NotNull String sortedString, int sortedStringLength){
        char[] sortedStringChars = sortedString.toCharArray();
        for (int i = 0; i < sortedStringLength - 1; i++){
            if (sortedStringChars[i] == sortedStringChars[i+1]) {
                System.out.println("Дублируется символ " + sortedStringChars[i]);
                break;
            }else if (i == sortedStringLength - 2) {
                System.out.println("В строке нет дублирующихся символов");
            }
        }

    }

    // Задание 5
    public static void revertArray(int[] initialArray) {
        int firstNum = 0;
        int lastNum = initialArray.length - 1;
        while (firstNum < lastNum) {
            int temp = initialArray[firstNum];
            initialArray[firstNum++] = initialArray[lastNum];
            initialArray[lastNum--] = temp;

        }
        System.out.println(Arrays.toString(initialArray));
    }

}

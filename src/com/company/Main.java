package com.company;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Задача 1
        int year = 1601;
        years(year);
        //Задача 2
        String osName = "IOS";
        exitAdd(osName);
        //Задача 3
        int deliveryDistances = 500;
        int road = delivery(deliveryDistances);
        //Задача 4
        reverse();
        //Задача 5
        kakEtoReshat();
    }
    //Задача 1. (Метод)
    public static void years(int year) {
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            System.out.println("Vis");
        } else {
            System.out.println("ne vis");
        }
    }
    //Задача 2. (метод)
    public static int getClientOS(String name) {
        if (name.equals("iOS")) {
            return 0;
        } else {
            return 1;
        }
    }
    public static int exitAdd(String name){
        int currentYear = 2014;
        int ios = 0;
        int and = 1;
        int clientOs = getClientOS(name);
        if (clientOs == 1 && currentYear <2015){
            System.out.println("down light android");
        } else if (clientOs == 1 && currentYear >=2015) {
            System.out.println("down normal android"); }
        if (clientOs== 0 && currentYear <2015) {
            System.out.println("down light ios");
        } else if (clientOs == 0 && currentYear >=2015) {
            System.out.println("down normal ios"); }

        return currentYear;
    }
    //Задача 3 (метод)
    public static int delivery(int deliveryDistances){
        int deliveryDays = 1;
        if (deliveryDistances <=20) {
            System.out.println("delivery takes " + deliveryDays);
        } else if (deliveryDistances >20 && deliveryDistances <60) {
            System.out.println("delivery takes " + (deliveryDays + 1));
        } else if (deliveryDistances >=60 && deliveryDistances <=100) {
            System.out.println("delivery takes " + (deliveryDays +2));
        } else {
            System.out.println("error");
        }
        return deliveryDistances;
    }
    //Задча 4
    public static void reverse (){
        int [] arr = {3, 2, 1, 6, 5};
        String string = Arrays.toString(arr);
        StringBuilder string2 = new StringBuilder(string);
        System.out.println(string2.reverse());
    }
    //Задача 5
    public static void kakEtoReshat(){
        String str = "aabccddefgghiijjkk";
        char[] carray = str.toCharArray();
        System.out.println("string " + str);
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (carray[i] == carray[j]) {
                    System.out.print(carray[j] + " ");
                }
            }
        }

    }
}

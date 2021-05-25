package by.epam.unit03.main;

import java.util.Scanner;

//Даны два числа. Определить цифры, входящие в запись как первого так и
//        второго числа

public class Task06 {

    public static void main(String[] args) {
        int[] arr = new int[10];
        int a = 3986230;
        while(a != 0){
            arr[a % 10]++;
            a /=10;
        }
        int b = 59871;
        while(b != 0){
            if(arr[b % 10] != 0)
                System.out.println(b % 10);
            b /=10;
        }
    }
}

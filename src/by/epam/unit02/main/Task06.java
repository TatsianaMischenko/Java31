package by.epam.unit02.main;

//Даны натуральные числа М и N. Вывести старшую цифру дробной части и
//        младшую цифру целой части числа M/N.

public class Task06 {

    public static void main(String[] args) {

        double N = 222;
        double M = 488;
        double result;

        result = M/N;

        System.out.println("результат = " + result);
        int x;

        x = (int)result;

        System.out.println("Младшая цифра целой части числа = " + x%10);

        result = result - x;
        result  = result * 10;
        System.out.println("старшая цифра дробной части = " + (int)result);
    }
}

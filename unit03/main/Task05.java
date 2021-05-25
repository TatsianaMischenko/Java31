package by.epam.unit03.main;

//Составить программу для вычисления значений функции F(x) на отрезке [а, b]
//        с шагом h. Результат представить в виде таблицы, первый столбец которой –
//        значения аргумента, второй - соответствующие значения функции:

import java.util.Scanner;

public class Task05 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double a = 0,b = 0,h = 0,y;

        System.out.println("Enter a: >>>");
        if (sc.hasNextDouble()){
            a = sc.nextDouble();
        }
        System.out.println("Enter b: >>> ");
        if (sc.hasNextDouble()) {
            b = sc.nextDouble();
        }
        System.out.println("Enter h: >>>: ");
        if (sc.hasNextDouble()) {
            h = sc.nextDouble();
        }



        System.out.println("-------------------------");
        System.out.printf("|\t%4s\t|\t%4s\t|\n", "x", "F(x)");
        System.out.println("-------------------------");


        for(double x = a; x <=b; x = x + h)
        {
            y=2*Math.tan(x/2) + 1;


            System.out.printf("|\t%4.1f\t|\t%4.1f\t|\n", x, y);
        }
        System.out.println("--------------------------");
    }
}

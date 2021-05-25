package by.epam.unit03.main;

//Написать программу, в которой вводятся два операнда Х и Y и знак операции (+, –, /, *).
//Вычислить результат Z в зависимости от знака. Предусмотреть реакции на возможный неверный знак операции,
// а также на ввод Y=0 при делении. Организовать возможность многократных вычислений без перезагрузки программа
// (т.е. построить цикл). В качестве символа прекращения вычислений принять ‘#’.

import java.util.Scanner;

public class Task08 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double z;


        while (true) {


            System.out.println("Enter X >>>");

            while (!scanner.hasNextDouble()) {
                scanner.nextLine();
                System.out.println("Введите число");

            }
            double x = scanner.nextDouble();

            System.out.println("Введите  знак операции (+, –, /, *)  >>>");{
//            while (!scanner.nextLine().equals("+") | !scanner.nextLine().equals("-") | !scanner.nextLine().equals("*") | !scanner.nextLine().equals("/")) {
//                scanner.nextLine();
//                System.out.print("Введите  знак операции (+, –, /, *)  >>>");

            }
            String opr = scanner.next();


            System.out.println("Enter Y  >>>");
            while (!scanner.hasNextDouble()) {
                scanner.nextLine();
                System.out.println("Введите число");
            }
            double y = scanner.nextDouble();


            switch (opr) {
                case "+":
                    z = x + y;
                    System.out.println(x + opr + y + " = " + z);
                    break;

                case "-":
                    z = x - y;
                    System.out.println(x + opr + y + " = " + z);
                    break;

                case "*":
                    z = x * y;
                    System.out.println(x + opr + y + " = " + z);
                    break;

                case "/":
                    if (y == 0) {
                        System.out.println("Деление на ноль не возможно. Введите другое число");
                        while (!scanner.hasNextDouble()) {
                            scanner.nextLine();
                            System.out.println("Введите число");
                        }
                         y = scanner.nextDouble();
                        z = x / y;
                        System.out.println(x + opr + y + " = " + z);
                    } else {
                        z = x / y;
                        System.out.println(x + opr + y + " = " + z);
                    }
                    break;

                default:
                    System.out.println("Вычисление не возможно. Знак операции был введен не верно. Введите  верный знак операции (+, –, /, *)  >>>");

                    continue;
            }
            System.out.print("Для выхода введите #. Для продолжения введите Enter");
            if (scanner.hasNextLine()) {
                scanner.nextLine();
                if (scanner.nextLine().equals("#")) {
                    break;
                }
            } else if (scanner.nextLine().equals("")) {
                continue;
            }

        }

    }
}









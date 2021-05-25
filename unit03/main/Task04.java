package by.epam.unit03.main;

//Составить таблицу значений функции y = 5 - x2/2 на отрезке [-5; 5] с шагом
//        0.5.
public class Task04 {

    public static void main(String[] args) {

        double h = 0.5;
        double y;
        double a = -5;
        double b = 5;

        System.out.println("---------------------------------");
        System.out.printf("|\t%4s\t|\t%4s\t|\n", "x", "y");
        System.out.println("---------------------------------");

        for(double x = a; x <=b; x = x + h)
        {
            y = 5 - x * x / 2;

            System.out.printf("|\t%4.1f\t|\t%4.1f\t|\n", x, y);
        }
        System.out.println("---------------------------------");
    }
}

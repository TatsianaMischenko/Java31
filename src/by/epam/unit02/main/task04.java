package by.epam.unit02.main;

//Вычислить расстояние между двумя точками с данными координатами
//       A (х1, у1) и B (x2, у2).

//AB = √(xb - xa)2 + (yb - ya)2

public class task04 {

    public static void main(String[] args) {

        double x1 = 1;
        double x2 = 6;
        double y1 = 2;
        double y2 = 4;
        double AB;

        AB = Math.sqrt((Math.pow(x2,2) - Math.pow(x1,2)) + (Math.pow(y2,2) - Math.pow(y1,2)));

        System.out.println("расстояние между двумя точками с данными координатами = " + AB);

    }
}

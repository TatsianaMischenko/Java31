package by.epam.unit02.main;

//Даны три действительных числа. Возвести в квадрат те из них, значения
//        которых неотрицательны, и в четвертую степень — отрицательные

public class Task07 {

    public static void main(String[] args) {

        double x = 5;
        double y = -5;
        double z = 2;

        if (x > 0) {
            x = Math.pow(x, 2);
        } else {
            x = Math.pow(x, 4);
        }

        if (y > 0) {
            y = Math.pow(y, 2);
        } else {
            y = Math.pow(y, 4);
        }

        if (z > 0) {
            z = Math.pow(z, 2);
        } else {
            z = Math.pow(z, 4);
        };

        System.out.println("x = " + x + ";  z = " + z + "; y = " + y);


    }
}

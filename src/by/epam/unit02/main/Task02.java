package by.epam.unit02.main;

//Перераспределить значения переменных х и у так, чтобы в х оказалось большее из этих значений, а в y - меньшее.

public class Task02 {
    public static void main(String[] args) {
        int x = 10;
        int y = 50;

       int min = x;
        int max = y;

        if (x < y){
            x= max;
            y= min;

        }

        System.out.println("X = " + x + " and Y = " + y);

    }
}

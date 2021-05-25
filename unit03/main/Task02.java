package by.epam.unit03.main;

//С помощью оператора while напишите программу определения суммы всех
//        нечетных чисел в диапазоне от 1 до 99 включительно.

public class Task02 {

    public static void main(String[] args) {

        int x = 1;
        int y = 99;
        int sum =0;

        while(x <= y) {
            sum = sum + x;
            x++;
            if (((x % 2) != 0) && ((y%2)!=0)) {

                System.out.println(x + "+" + y + "=" + sum);
            }
        }
    }
}



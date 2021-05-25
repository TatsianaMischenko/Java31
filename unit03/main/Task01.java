package by.epam.unit03.main;

//Необходимо вывести на экран таблицу умножения на 3.

public class Task01 {
    public static void main(String[] args) {
        int x = 3;
        int sum;

        for (int i = 0; i < 11; i++) {
            sum = i*x;

            System.out.println(i + "*" + x  + "=" + sum);

        }

    }

}

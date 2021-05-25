package by.epam.unit03.main;

//Написать программу, переводящую римские цифры в арабские

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String arabicNumeral = null;
        int romanNumeral;


        System.out.println("Введите Римскую цифру от 1-10 >>>>");

        while (sc.hasNextInt()==false){
            sc.next();
            System.out.println("Вы ввели неверное значение попробуйте снова");
        }
        romanNumeral = sc.nextInt();

        if (romanNumeral>10){
            System.out.println("Введите Римскую цифру от 1-10 >>>> ");
            romanNumeral = sc.nextInt();
        }



        switch (romanNumeral){

            case 1:
                arabicNumeral = "I";
                break;
            case 2:
                arabicNumeral = "II";
                break;
            case 3:
                arabicNumeral = "III";
                break;
            case 4:
                arabicNumeral = "IV";
                break;
            case 5:
                arabicNumeral = "V";
                break;
            case 6:
                arabicNumeral = "VI";
                break;
            case 7:
                arabicNumeral = "VII";
                break;
            case 8:
                arabicNumeral = "VIII";
                break;
            case 9:
                arabicNumeral = "IX";
                break;
            case 10:
                arabicNumeral = "X";
                break;
        }

        System.out.println(arabicNumeral);
    }

}

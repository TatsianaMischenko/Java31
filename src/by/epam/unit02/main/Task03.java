package by.epam.unit02.main;

//Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести данное значение длительности в часах, минутах и секундах в следующей форме:
//        ННч ММмин SSc.

public class Task03 {
    public static void main(String[] args) {
        int ч;
        int мин;
        int с;

        int T = 86399;
        ч = T / 3600;
        мин = (T - ч * 3600) / 60;
        с = T - ч * 3600 - мин * 60;

        String часов = String.format("%d", ч);
        String минут = String.format("%d", мин);
        String секунд = String.format("%d", с);

        System.out.println(часов + "ч" + " " + минут + "мин" + " " + секунд + "с");




//        System.out.println(LocalTime.ofSecondOfDay(86399));
    }



}

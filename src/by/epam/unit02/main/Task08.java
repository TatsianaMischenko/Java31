package by.epam.unit02.main;

//Для данных областей составить линейную программу, которая печатает true,
//        если точка с координатами (х, у) принадлежит закрашенной области, и false —
//        в противном случае

public class Task08 {

    public static void main(String[] args) {

                double x1 = -2;
                double x2 = 2;
                double y1 = 0;
                double y2 = 4;
                double x3 = -4;
                double x4 = 4;
                double y3 = 0;
                double y4 = -3;

                double pointX = 0;
                double pointY = 0;

                if (((pointX >= x1) && (pointX <= x2)) && ((pointY >= y1) && (pointY <= y2))) {
                    System.out.println("TRUE");
                } else if (((pointX >= x3) && (pointX <= x4)) && ((pointY >= y4) && (pointY <= y3))) {
                    System.out.println("TRUE");
                } else {
                    System.out.println("FALSE");
                }
            }
        }
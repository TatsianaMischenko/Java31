package by.epam.unit03.main;

//Вычислить: (1+2)*(1+2+3)*...*(1+2+...+10).

public class Task03 {
    public static void main(String[] args) {
        int sum = 1;
        int res = 1;
        int i = 2;
        while( i < 11 )
        {
//            sum += i;
            sum = sum + i;
//            res *= sum;
            res = res * sum;
            i++;
        }


                System.out.println(res);
            }
        }



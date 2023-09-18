package calculator;
import java.util.Scanner;
import java.util.Scanner;
import java.io.*;
import java.lang.Math;
public class calc {

    public static void main(String[] args) {


        Scanner myObj = new Scanner(System.in);
        System.out.println("enter number one");
        int n1 = myObj.nextInt();
        System.out.println("enter number two");
        int n2 = myObj.nextInt();
        System.out.println("enter which operation you prefer");
        String operator = myObj.next();

        System.out.println("the answer is" + calculator(n1, operator, n2));
    }

        public static int calculator(int n1,String operator,int n2)
        {
        int a=0;

        switch(operator) {
            case "sum":
                a = n1 + n2;
                break;

            case "difference":
                a = n1 - n2;
                break;

            case "multiply":
                a = n1 * n2;
                break;

            case "division":
                a = n1 / n2;
                break;

            case "mod":
                a= n1%n2;
                break;

            case "exp":
               double fn=n1;
                double sn =n2;
                a = (int)(Math.pow(fn,sn));

                break;

            default:
                System.out.println("enter a valid operator");
                break;
        }
       return a;



    }
}

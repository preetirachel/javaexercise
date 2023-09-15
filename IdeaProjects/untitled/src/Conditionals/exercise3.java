package Conditionals;
import java.sql.SQLOutput;
import java.util.Scanner;

public class exercise3 {

    public static void main(String[] args) {
// checking which is bigger
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter first num");
        int fn = myObj.nextInt();
        System.out.println("Enter second num");
        int sn = myObj.nextInt();
        if(fn>sn)
            System.out.println(fn + " is greater");
        else
            System.out.println(sn + " is greater");
        System.out.println("enter another number to check if odd or even");

        // checking odd or even
        int n= myObj.nextInt();
        if(n%2==0)
            System.out.println("it is even");
        else System.out.println("it is odd");

        //checking traffic light

        System.out.println("enter a color of traffic light ");
        String l= myObj.nextLine();
        if( l== "red")
            System.out.println("STOP");
        else if (l== "green")
            System.out.println("GO");
        else System.out.println(" not a valid color :P");

     // weather
        System.out.println(" enter a number bw one and twelve");
        int w= myObj.nextInt();
        switch(w) {
            case 1:
            case 2:
            case 3:
                System.out.println("it is spring");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("it is summer");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("it is autumn");
                break;
            case 10:
            case 11:
            case 12:
                System.out.println(" it is winter");
                break;
            default:
                System.out.println(" invalid number, try again!");
        }









    }
}

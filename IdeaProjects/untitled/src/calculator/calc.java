package calculator;
import java.util.Scanner;
import java.util.Scanner;

public class calc {

    public static void main(String[] args) {


        Scanner myObj = new Scanner(System.in);
        System.out.println("enter number one");
        int n1= myObj.nextInt();
        System.out.println("enter number two");
        int n2= myObj.nextInt();
        System.out.println("enter which operation you prefer");
        String operator= myObj.next();
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

            default:
                System.out.println("enter a valid operator");
                break;
        }
        System.out.println("the answer is" + a);



    }
}

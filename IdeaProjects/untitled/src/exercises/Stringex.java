
package exercises;
import java.util.Scanner;

public class Stringex {

    public static void main(String[] args) {
       /* String first_name = "preeti";
        String last_name = "rachel jasper";
                String fullname= first_name + " " + last_name;
        System.out.println(fullname); */
    //Number exercise

    /* int n1=89;
    int n2=67;
    int sum= n1+n2;
    int result = n1/n2;
    int numm=8;
        System.out.println(numm++);
        System.out.println(numm);
        System.out.println(++numm); */

        //input
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter first name");
        String firstName = myObj.nextLine();
        System.out.println("Enter last name");
        String lastName = myObj.nextLine();
        System.out.println("Username is: " + firstName + lastName);
        //System.out.println("Username is: " + userName);

        System.out.println("Enter number");
        int n1 = myObj.nextInt();
        System.out.println("Enter another number");
        int n2 = myObj.nextInt();
        System.out.println("Username is: " + (n1 + n2));









    }
}

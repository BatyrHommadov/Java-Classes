package class5;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ScannerDemo1 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        /*
        Scanner => name of the class
        scan => is just a variable like we create primitive variables
        "=" => is just an assignment operator
        System.in => tells the computer we want to read the data from keyboard
         */

        System.out.println("Please enter your age");
        int age=scan.nextInt();
        System.out.println("You are "+age+" years old");

        System.out.println("Please enter your weight");
        double weight=scan.nextDouble();
        System.out.println(" your weight is "+weight+" Kgs");
        System.out.println("Are you hungry?");
        boolean hungry=scan.nextBoolean();
        System.out.println("Hungry "+hungry);

        //for char type of input:
        System.out.println("Please enter your gender");
        char gender=scan.next().charAt(0);
        System.out.println("Your gender is "+gender);

        System.out.println("Please enter your name");
        String name=scan.next(); // used when we have to take only one word as input
        System.out.println("Your name is "+name);

        scan.nextLine(); // Trick to make nextLine method work after we have used any other method from Scanner class
        System.out.println("Please enter your full name");
        String fullName=scan.nextLine();
        System.out.println("Your full name is "+fullName);

        scan.close(); // always good practice to close scanner classes
    }
}

package class4;

import java.util.Scanner;
public class HomeWork4 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);

        System.out.println("How old are you?");

        int age=scan.nextInt();

        if (age>=18){
            System.out.println("Your driving license will be issued");
        } else{
            System.out.println("Please get a learners permit");
        }

    }
}

package class4;

import java.util.Scanner;
public class HomeWork7 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        System.out.println("How many years have you worked?");
        int years=input.nextInt();
        System.out.println("What is your annual salary?");
        int salary=input.nextInt();

        if (years>=5){
            System.out.println("You are eligible for bonus");
            if (salary>50000) {
                System.out.println("5000");
            } else {
                System.out.println("3000");
            } } else {
                System.out.println("Not eligible for bonus");
            }
        }
    }


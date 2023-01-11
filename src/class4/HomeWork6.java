package class4;

import java.util.Scanner;
public class HomeWork6 {
    public static void main(String[] args){

        Scanner input=new Scanner(System.in);
        System.out.println("Do you have a credit card?");

        String card=input.nextLine();

        if(card.equals("yes")) {
            System.out.println("What is the balance on the card?");
            int balance=input.nextInt();

            if (balance>1000) {
                System.out.println("Pay off immediately");
            } else {
                System.out.println("You can spend more");
            }}
        if (card.equals("no")) {
            System.out.println("You can apply for a credit card");
        }
    }
}

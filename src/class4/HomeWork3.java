package class4;

import java.util.Scanner;
public class HomeWork3 {
    public static void main(String[] arg) {

        Scanner input=new Scanner(System.in);
        System.out.println("What is the amount of loan needed?");

        int loan=input.nextInt();
        int amount=200000;

        if (amount>=200000) {
            System.out.println("Your loan approved");
        } else {
            System.out.println("Your loan request rejected");
        }
    }
}

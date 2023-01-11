package class4;

import java.util.Scanner;
public class HomeWork5 {
    public static void main(String[] args){

        Scanner input=new Scanner(System.in);

        System.out.println("What is your city?");
        String city=input.nextLine();

        System.out.println("What is the temperature in your city?");
        int temperature=input.nextInt();

        System.out.println("The temperature in "+city+" is "+((temperature-32)*0.5556));
    }
}

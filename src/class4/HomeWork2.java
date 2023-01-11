package class4;
import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args){

        Scanner input= new Scanner(System.in);
        System.out.println("Please enter the mortgage rate");
        double mortgageRate=input.nextDouble();

        if (mortgageRate>4.5) {
            System.out.println("You will not buy a house");
        }
        System.out.println("Enter the house price");

        double housePrice=input.nextDouble();

        if (housePrice>200000){
            System.out.println("You can take a loan");
        } else {
            System.out.println("I'll pay cash");
        }

    }

}

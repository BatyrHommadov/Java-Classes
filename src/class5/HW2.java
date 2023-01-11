package class5;

import java.util.Scanner;

public class HW2 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Please enter number ");
        int day=in.nextInt();

        if(day>=1&&day<=5){
            System.out.println("It is a weekday");
        }else if (day>5&&day<=7){
            System.out.println("It is a weekend");
        }else{
            System.out.println("Invalid day");
        }
    }
}

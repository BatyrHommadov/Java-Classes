package class5;

import java.util.Scanner;

public class HW6 {
    public static void main(String[] args){

        Scanner input=new Scanner(System.in);
        System.out.println("Please enter three numbers");

        int num1= input.nextInt();
        int num2= input.nextInt();
        int num3= input.nextInt();

        if(num1>num2&&num1>num3){
            System.out.println(num1+" is the largest number");
        }else if(num2>num1&&num2>3){
            System.out.println(num2+" is the largest number");
        }else if(num3>num1&&num3>num2){
            System.out.println(num3+" is the largest number");
        }
    }

}

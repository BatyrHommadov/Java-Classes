package class5;

import java.util.Scanner;

public class HW8 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        int num1= input.nextInt();
        int num2= input.nextInt();
        System.out.println("Enter one of the operators (-,+,/,*)");
        String operator=input.next();

        switch(operator) {
            case "-":
                System.out.println(num1 - num2);
                break;
            case "+":
                System.out.println(num2 + num1);
                break;
            case "/":
                System.out.println(num1 / num2);
                break;
            case "*":
                System.out.println(num1 * num2);
                break;
            default:
                System.out.println("Invalid operator");
        }

    }
}

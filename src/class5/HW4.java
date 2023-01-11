package class5;

import java.util.Scanner;

public class HW4 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Please enter the month of birth:");

        String month=in.nextLine();

        if(month.equals("January")||month.equals("February")||month.equals("December")){
            System.out.println("You were born in Winter");
        } if(month.equals("March")||month.equals("April")||month.equals("May")){
            System.out.println("You were born in Spring");
        } if(month.equals("June")||month.equals("July")||month.equals("August")){
            System.out.println("You were born in Summer");
        } if(month.equals("September")||month.equals("October")||month.equals("November")){
            System.out.println("You were born in Autumn");
        }
    }
}

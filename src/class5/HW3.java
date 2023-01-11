package class5;

import java.util.Scanner;

public class HW3 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);

        System.out.println("Please enter your quiz score");
        int quiz=in.nextInt();

        System.out.println("Please enter your midterm score");
        int midterm=in.nextInt();

        System.out.println("Please enter your final score");
        int finalScore=in.nextInt();

        if(quiz>=90){
            System.out.println("Your score is "+quiz+" = grade A");
        }else if(midterm>=70&&midterm<90){
            System.out.println("Your score is average "+midterm+" = grade B");
        }else if(finalScore>=50&&finalScore<70){
            System.out.println("Please enter final score "+finalScore+" = grade C");
        }
    }
}

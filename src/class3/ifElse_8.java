package class3;

public class ifElse_8 {
    public static void main(String[] args) {

        int age=17;
            System.out.println((age<18));
        if (age<18){
            System.out.println("Time to play");
        }

        boolean inSyntaxBootCamp=true;

        /*
        if conditions work based on boolean true or false - we have a true inside the () it executes all the code inside {};
        if it is false - it does not execute any code inside {};
         */

        if(inSyntaxBootCamp){
            System.out.println("Time to start practicing Java");
        }
    }
}

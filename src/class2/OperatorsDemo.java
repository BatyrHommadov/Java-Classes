package class2;

public class OperatorsDemo {
    public static void main(String[] args) {

        int number=10;
        // int number=20; ===> WRONG; do not name different boxes with the same name, not allowed

        System.out.println(number);

        int number1=10;
        int number2=20;
        System.out.println(number1+number2);
        System.out.println(number1-number2);
        System.out.println(number1*number2);
        System.out.println(number1/number2);

        /*
        if you have to store whole numbers - always use int;
        if you have to store decimal numbers - always use double;
        if you have to store characters - you can always use String;
         */

    }
}

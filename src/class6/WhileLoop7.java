package class6;

public class WhileLoop7 {
    public static void main(String[] args) {

        //Print below sequence with the help of loop
        // 1 2 3 4 6 7 8 9 11 12 13 14 16

        int num = 0;
        while (num <= 16) {
            if (num % 5 != 0) {
                System.out.println(num);
            }
            num++;
        }
        System.out.println(("**********************"));

        int num1 = 1;
        while (num1 <= 16) {
            if (num1 % 5 == 0) {
            } else {
                System.out.println(num1);
            }
            num1++;
        }
    }
}

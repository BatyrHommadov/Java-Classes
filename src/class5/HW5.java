package class5;

public class HW5 {
    public static void main(String[] args){

        double num1=5.2;
        double num2=18.5;
        double num3=29.6;

        if(num1>num2&&num1>num3){
            System.out.println("The greatest number is "+num1);
        }else if(num2>num1&&num2>num3){
            System.out.println("The greatest number is "+num2);
        }else if(num3>num1&&num3>num2){
            System.out.println("The greatest number is "+num3);
        }

    }
}

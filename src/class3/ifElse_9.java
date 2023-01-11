package class3;

public class ifElse_9 {
    public static void main(String[] args) {

        char c='M';

        if(c=='M'){
            System.out.println("Male");
        }

        String name="Nat";
        //with non-primitive data types, such as String we cannot use == symbol
        if(name.equals("Sam")){
            System.out.println("Amazing student");
        }

        // ! symbol can change/reverse true to false and false to true
        if(!name.equals("Sam")) {
            System.out.println("Super Amazing student");
        }
    }
}

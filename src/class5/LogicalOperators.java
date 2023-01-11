package class5;

public class LogicalOperators {
    public static void main(String[] args){

        /*
        Logical operators only with boolean values, nothing else.
        ! Not operator (reverses boolean)
         */
        System.out.println(!true);
        System.out.println(!false);
        boolean rich=true;
        System.out.println(!rich);

        int number=9;

        if(number!=1){
            System.out.println("Hello Java");
        }else {
            System.out.println("Hello world");
        }
        String country="China";
        if(!country.equals("BadCountry")){
            System.out.println("You are welcome");
        }
        if(country.equals("China")){
            System.out.println("You are welcome");
        }
        if(country.equals("Nepal")){
            System.out.println("You are welcome");
        }
    }

}


package class6;

public class SwitchCaseDemo {
    public static void main(String[] args){

        String country="Italy";
        System.out.println(country.toLowerCase());

        switch (country.toLowerCase()){ //toLowerCase converts text to lower case

            case "usa":
                System.out.println("Burgers");
                break;
            case "italy":
                System.out.println("Pasta");
                break;
            case "afghanistan":
                System.out.println("Kebab");
                break;
            default:
                System.out.println("Wrong country");

        }
    }
}
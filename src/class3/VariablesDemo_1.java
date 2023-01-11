package class3;

public class VariablesDemo_1 {
    public static void main(String[] args){

        int age=10; // requesting the computer to create a box of type int and store a value of 10 in it.
        int salary; // only create a box of type int and don't assign any value to it.
        salary=120000; // updating (or reassigning) the variable value.

        System.out.println(salary);

        /*String name;
          String city;
          String country
         */
        String name, city, country; // we can create multiple empty boxes in a single line of a code
        char gender, letter;
        name="Daria";

        // System.out.println(city); I have not stored anything inside the city variable, that's why java is confused
        // about what to print

        System.out.println(name);

    }
}

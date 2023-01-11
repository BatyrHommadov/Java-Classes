package class2;

import java.sql.SQLOutput;

public class HomeWork {
    public static void main(String[] args) {
        String name="Practice Variables";
        byte box1=127;
        short box2=32567;
        int box3=12345678;
        long box4=1234567890l;

        System.out.println(name);
        System.out.println(box1);
        System.out.println(box2);
        System.out.println(box3);
        System.out.println(box4);

        String name1="Variable Values";
        byte var1=99;
        short var2=32000;
        int var3=2000000;
        long var4=1000000000l;

        var1=100;
        var2=32500;
        var3=3000000;
        var4=2000000000l;

        System.out.println(name1);
        System.out.println(var1);
        System.out.println(var2);
        System.out.println(var3);
        System.out.println(var4);

        String name2="Variables";
        String student="Student's Info";
        String firstName="Joaquin";
        String lastName="Phoenix";
        char grade='A';
        String city="Los Angeles";
        String state="California";
        String phoneNumber="+1800-456-7890";

        System.out.println("**************************");
        System.out.println(name2);
        System.out.println(student);
        System.out.println(firstName+" "+lastName);
        System.out.println(grade);
        System.out.println(city+","+" "+state);
        System.out.println(phoneNumber);

        city="Austin";
        state="Texas";
        grade='B';
        phoneNumber="00800-987-6543";

        System.out.println("*************************");
        System.out.println(name2);
        System.out.println(student);;
        System.out.println(firstName+" "+lastName);
        System.out.println(grade);
        System.out.println(city+","+" "+state);
        System.out.println(phoneNumber);

        String statement="The addition of two numbers 10.5 and 10.5 is equal to";
        double number1=10.5;
        double number2=10.5;

        System.out.println("*************************");
        System.out.println(statement+" "+(number1+number2));

        String statement1="The subtraction of two numbers 10.5 and 10.5 is equal to";
        System.out.println(statement1+" "+(number1-number2));

        String statement2="The multiplication of two numbers 10.5 and 10.5 is equal to";
        System.out.println(statement2+" "+(number1*number2));

        String statement3="The division of two numbers 10.5 and 10.5 is equal to";
        System.out.println(statement3+" "+(number1/number2));

        String statement4="The square of the 3.9 is";
        double square=3.9;
        double square1=3.9;

        System.out.println(statement4+" "+(square*square1));

        String statement5="The perimeter of a rectangle with width 5.0 and height 8.0 is equal to";
        double width=5.0;
        double height=8.0;

        System.out.println("*************************");
        System.out.println(statement5+" "+((width*2)+(height*2))+" "+"and the area is equal to"+" "+(width*height));



    }
}

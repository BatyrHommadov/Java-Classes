package class4;

public class ifElseConditions_2 {
    public static void main(String[] args) {

        boolean rain=false;

        if(rain){
            System.out.println("Let's take the umbrella"); //Plan A
        }else{
            System.out.println("Let's just take the hat"); //Plan B
        }

        //create a boolean variable, call it break, if we have true print "let's take the break, otherwise
        //it should print lets continue the class

        boolean breakTime=true;

        if(breakTime){
            System.out.println("Let's take the break");
        }else{
            System.out.println("Let's continue the class");
        }
    }
}

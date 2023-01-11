package class4;

public class ifDemo_1 {
    public static void main(String[] args) {

        int money = 15000;

        if (money > 1000) {
            System.out.println("Let's buy the iPhone");
        }
        if (money > 2000) {
            System.out.println("Let's also buy a Macbook");
        }

        boolean mothersDay = true;

        if (mothersDay) {
            System.out.println("Happy Mother's Day");
        }

        String name = "Sardar";

        if (name.equals("Sardar")) {
            System.out.println("I love football");
        }
    }
}

/*
IMPORTANT NOTES:
    1. For String we use equals method instead of == sign, because it is a non-primitive data type
    2. We can cmd+opt+l (for Mac) to format our code.
    3. If we are confused about brackets, we can click on opening or closing part to check the other part.
 */
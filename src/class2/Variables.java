package class2;

public class Variables {
    public static void main(String[] args) {
        /*
        Below line is reserving a box in the computer's memory, we are calling it box1. If we need the info
        that we are storing inside this box - we can simply say to the computer "give us the content of box1".
        int=> what type of data we want to store
        box1=> is the name of the box
        = sign will take whatever we write after it and will store it inside the box1.
        10=> is what we are storing inside the box.
         */
       int box1=10;
       // if we are printing something from a box we don't need double quotes ""
       System.out.println(box1); // bring the content of box1 and print it on the console

        //lava said "don't call me lava" - means it will print only the quoted statement ""

        /*To store whole numbers we have 4 different types of boxes. For example: 10, 20, 3000, 100000, 330000
        1) byte
        2) short
        3) int
        4) long
        */
        byte box2=127;
        byte box3=-128; //range for byte is from -128 to 127, if we need to store larger numbers we should try short type
        short box4=32767;
        int box5=123456789; //most common type of box
        long box6=15131351465644l;

        /*
        Reserve a box which can hold the number 10000, call it myBox and print its value on the console
         */

        int myBox=10000;
        System.out.println(myBox);
        short myBox1=10000;
        System.out.println(myBox1);
    }
}

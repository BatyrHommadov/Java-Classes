package class7;

public class ForLoops4 {
    public static void main(String[] args){
        
        //1 2 4 5 7 8 10 11 13 14 16 17 19;
        for (int i = 1; i <20 ; i++) {
            if (i%3!=0){ //this condition divides all the numbers by 3 and checks if the remainder is not zero
                System.out.println(i);
            }
            
        }
    }
}

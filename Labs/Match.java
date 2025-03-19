package Labs;
import java.util.Scanner;
public class Match{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String x, y;
        boolean aMatch = true;


        System.out.print("Enter a word: ");
        x = input.next();
        System.out.print("Enter another word: ");
        y = input.next();

        aMatch = (x.equals(y));
        if(aMatch){
            System.out.println("Both words entered match");
        }else{
            System.out.println("Both words entered do not match");
        }
        

     input.close();
    }
}
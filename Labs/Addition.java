package Labs;
import java.util.Scanner;
public class Addition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int counter = 1;
        int total = 0;

        while(counter <= 5){
            System.out.print("Enter number " + counter + ": ");
             total += input.nextInt();
             counter++;
        }
        System.out.println("Total: " + total);

        input.close();
    }
}

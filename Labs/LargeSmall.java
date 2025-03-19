package Labs;
import java.util.Scanner;
public class LargeSmall {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int counter = 1;
        int total = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        while(counter <= 5){
            if (total > max){
                max = total;
            }
            if(total < min){
                min = total;
            }
            System.out.print("Enter number " + counter + ": ");
             total += input.nextInt();
             counter++;
        }
        System.out.println("The largest number is: " + total);
        System.out.println("The smallest number is: " + total);

        input.close();
    }
}

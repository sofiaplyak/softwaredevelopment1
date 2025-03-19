package Exampract;
import java.util.Scanner;
public class countnumbr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 0, pos = 0, neg = 0, zero = 0, choice = 1, any = 0;
        System.out.println("Enter some digits (1 for yes, any other number for no)? ");
        choice = input.nextInt();
        while(choice == 1){
            System.out.print("\nEnter the value: ");
            number = input.nextInt();
           if(number > 0){
            pos++;
           }else if(number < 0){
            neg++;
           }
           else{
            zero++;
           }
           System.out.print("Continue (1 for yes, any other number for no)? ");
           choice = input.nextInt();
           any++;
        }
        if(any > 0){
            System.out.println("\nPositive Numbers: " + pos);
            System.out.println("\nNegative Numbers: " + neg);
            System.out.println("\nNumber of Zeros: " + zero);
        }else{
            System.out.println("No numbers entered");
        }

        input.close();
    }
}

package Exampract;
import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 0;
        int total = 0;

        while(number != -1){
            System.out.print("Enter number (-1 to quit): ");
            number = input.nextInt();
            if(number != -1){
                total += number;
            }
        }
        System.out.println("total: " + total);
        input.close();
    }
}

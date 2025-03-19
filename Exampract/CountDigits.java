package Exampract;
import java.util.Scanner;
public class CountDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 0;
        System.out.print("Enter a number: ");
        number = input.nextInt();
        System.out.println(number + " reversed is: ");
        int count = 0;
        while(number > 0){
            count++;
            number /= 10;
        }
        System.out.println(" contains " + count + " digits.");
        input.close();
    }
}

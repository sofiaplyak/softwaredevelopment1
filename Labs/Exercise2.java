package Labs;
import java.util.Scanner;
public class Exercise2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double num1 = 0;
        double num2 = 0;
        double num3 = 0;


        
        System.out.print("Enter first number: ");
        num1 = input.nextDouble();
        System.out.print("Enter second number: ");
        num2 = input.nextDouble();
        System.out.print("Enter third number: ");
        num3 = input.nextDouble();


        System.out.println(num1 + " * " + num2 + " * " + num3 + " = " + (Math.round((num1 * num2 * num3)*100.0) / 100.0));



        input.close();
    }
}

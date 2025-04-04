package Methods;
import java.util.Scanner;
public class average {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x, y, z;
        System.out.print("Enter the first number: ");
        x = input.nextDouble();
        System.out.print("Enter the second number: ");
        y = input.nextDouble();
        System.out.print("Enter the third number: ");
        z = input.nextDouble();

        double result = avg(x, y, z);
        System.out.println("Average is: " + result);

        input.close();
    }

    // methods //
    static double avg(double x, double y, double z){
        double result = (x + y + z) / 3;
        return result;
    }
}

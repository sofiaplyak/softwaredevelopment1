package Exampract;
import java.util.Scanner;
public class Cubes {
    public static void main(String[] args) {
        try (Scanner inut = new Scanner(System.in)) {
            int number = 0;
            int total = 1;
            int count = 2;
            System.out.print("Enter a number: ");
            number = inut.nextInt();
            System.out.print("Sum of cubes: 1^3  + ");
            for( ; count < number; count++){
                System.out.print(count + "^3 + ");
                total += (count*count*count);
            }
            total += (count*count*count);
            System.out.println(count  + "^3 = " + total);

            inut.close();
        }
    }
}

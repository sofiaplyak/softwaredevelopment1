import java.util.Scanner;

public class exer2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x,y;

        System.out.print("Enter first number: ");
        x = input.nextInt();
        System.out.print("Enter second number: ");
        y = input.nextInt();

        System.out.println("(" + x + " + " + y + " )" + " * 4" + " = " + ((x+y)*4));

        input.close();
    }
}

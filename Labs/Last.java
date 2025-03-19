package Labs;
import java.util.Scanner;

public class Last {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String a;

        System.out.print("Enter a word:");
        a = input.next();

        System.out.println("Last character in " + a + " is " + (a.charAt(a.length() - 1)));

        input.close();
    }
}

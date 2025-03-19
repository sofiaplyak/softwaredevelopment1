package Labs;
import java.util.Scanner;

public class ThirdLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = 1;
        int y = 0;

        System.out.print("Enter number of loops: ");
        y = input.nextInt();

        System.out.println(Integer.MAX_VALUE);
        while(x <= y){
            System.out.println("Loop " + x + ".");
            x++;
        }
        input.close();
    }
}

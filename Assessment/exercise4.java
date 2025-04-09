package Assessment;
import java.util.Scanner;
public class exercise4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char symbol;

        System.out.print("Enter a symbol: ");
        symbol = input.next().charAt(0);


        int length = 4;
        int width = 5;
        for(int i = 0; i < length; i++){
            for(int j = 0; j < width; j++){
                System.out.print(symbol + " ");
            }
            System.out.println();
        }

        input.close();
    }
}

package Labs;
import java.util.Scanner;

public class Sales {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberSold = 0;
        double Sales = 0;

        for(int product = 1; product <= 4; product++){
            System.out.print("Number of item sold, product " + product + ": ");
            numberSold = input.nextInt();
            if(product == 1){
                Sales += 239.99 * numberSold;
            }else  if(product == 2){
                Sales += 129.75 * numberSold;
            }else  if(product == 3){
                Sales += 99.96 * numberSold;
            }else  {
                Sales += 360.89 * numberSold;
            }
        }
        System.out.println("Earnings for week are: " + Math.round(Sales * 0.09 + 200));

        input.close();
    }
}

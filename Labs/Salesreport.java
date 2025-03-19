package Labs;

import java.util.Scanner;

public class Salesreport {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberSold = 0;
        double Sales = 0;
        String div = "----------------------------------------\n";
        String output = div;
        output += "Item\t\tSold\tTotal\n";
        output += div;
        System.out.println(output);

        for(int product = 1; product <= 4; product++){
            System.out.print("Number of item sold, product " + product + ": ");
            numberSold = input.nextInt();
            output += "Product " + product + "\t" + numberSold;
            if(product == 1){
                output += Math.round(239.99 * numberSold) + "\n";
                Sales += 239.99 * numberSold;
            }else  if(product == 2){
                output += Math.round(129.75 * numberSold) + "\n";
                Sales += 129.75 * numberSold;
            }else  if(product == 3){
                output += Math.round(99.96 * numberSold) + "\n";
                Sales += 99.96 * numberSold;
            }else  {
                output += Math.round(360.89 * numberSold) + "\n";
                Sales += 360.89 * numberSold;
            }
        }
        output += div;
        output += "Total:\t\t\t" + Math.round(Sales) + "\n";
        output +=  div;
        output += "Commission:\t\t" + Math.round(Sales * 0.09 + 200) + "\n";
        output += div;
        System.out.println(output);
        //System.out.println("\nEarnings for week are: " + Math.round(Sales * 0.09 + 200));//

        input.close();
    }
}



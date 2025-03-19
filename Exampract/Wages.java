package Exampract;
import java.util.Scanner;
public class Wages {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int hours = 0;
        double rate = 0;
        double pay = 0;
        int counter = 1;
        while(counter <= 3){
        System.out.print("Enter hours worked: ");
        hours = input.nextInt();
        System.out.print("Enter hourly rate: ");
        rate = input.nextDouble();

        pay = (hours * rate);
        System.out.println("Pay for Employee "+ counter+ " is : " + pay);
        System.out.println();
        counter++;
        if(hours > 40){
            int extra = (hours - 40);
            pay = (40  * rate) + (extra * rate);  
        }
    }

        input.close();
    }
}

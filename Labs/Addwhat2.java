package Labs;
import java.util.Scanner;
public class Addwhat2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = 0;

        System.out.print("Enter a number: ");
        num = input.nextInt();

        if(num > 100){
           num *= 10;
        }else if(num > 75 && num <= 100){
            num *= 8;
        }else if(num > 50 && num <= 75){
            num *= 6;
        }else if(num > 25 && num <= 50){
            num *= 4;
        }else{
            num *= 2;
        }
        System.out.println("Number is updated to: " + num);
      input.close();  
    }
}

package Labs;
import java.util.Scanner;
public class AddWhat1 {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int num = 0;
       
       System.out.print("Enter a number: ");
       num = input.nextInt();

       if(num > 20){
            
            System.out.println("Number updated to: " + (num + 2));
       }else if(num > 10 && num <= 20){
            System.out.println("Number updated to: " + (num + 3));
       }else if(num <= 10){
            System.out.println("Number updated to: " + (num + 1));
       }
       input.close();
      }
}
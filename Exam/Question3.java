
package Exam;
import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
       
       int count = 0;

        while(true){
            System.out.print("\nEnter the positive number: ");
            int number = input.nextInt();
           if(number < 1){
            break;//if number less yhan 1 break the loop
          }
          count++;;
        }
        System.out.println("you entered " + count + " positive numbers");
       
        input.close();
    }
}

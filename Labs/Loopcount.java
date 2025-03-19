package Labs;
import java.util.Scanner;
public class Loopcount {
    public static void main(String[] args) {
        
    Scanner input = new Scanner(System.in);
    int count = 1;
    int flag = 0;

    System.out.print("Want to loop: ( 0 for yes, any other number for no): ");
    if(input.nextInt() != 0){
        flag = 1;
    }
        
    while(flag == 0){
        System.out.print("loop again ( 0 for yes, any other number for no): ");
        if(input.nextInt() != 0){
            flag = 1;
        }
         count++;   
    }
    System.out.println("you looped " + count + " times.");        
    input.close();
    }
 }
         
    


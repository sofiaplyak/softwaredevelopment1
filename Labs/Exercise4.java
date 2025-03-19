package Labs;
import java.util.Scanner;
public class Exercise4 {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 0;
        
        System.out.print("Enter a number: ");
        number = input.nextInt();

        if(number > 1 && number < 5){
            System.out.println(number + " is updated to " + (number + 1));
        }else if(number > 21 && number < 25){
            System.out.println(number + " is updated to " + (number + 2));
        }else if(number > 41 && number < 45){
            System.out.println(number + " is updated to " + (number + 3));
        }else{
            System.out.println(number + " is updated to " + (number * number));
        }





        input.close();
    }
}

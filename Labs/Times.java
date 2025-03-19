package Labs;
import java.util.Scanner;
public class Times {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 0;
        int choice = 0;

        System.out.print("Enter a number: ");
        number = input.nextInt();
        System.out.print("Do you want addition or multiplication?");
        System.out.print("Enter 1 for addition, enter 2 for multiplication: ");
        choice = input.nextInt();

        if(choice == 1){
            //addition
            int i = 1;
            while(i <=12){
                System.out.println(number + " + " + i + "  = " + (number + i));
                i++;
            }
        }else if(choice == 2){
            //multiplication
            int i = 1;
            while(i <=12){
                System.out.println(number + " * " + i + "  = " + (number * i));
                i++;
        }
        }else{
            //invalid choice
            System.out.println("INVALID CHOICE!");
        }

        input.close();
    }
}

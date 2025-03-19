package Labs;
import java.util.Scanner;
public class addWhat3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = 0;

        System.out.print("Enter a number: ");
        num = input.nextInt();

        if(num > 100){
            num += 10;
        }else if(num > 50 && num <= 100){
            num += 5;
        }else if(num > 20 && num <= 50){
            num += 2;
        }else{
            num += 1;
        }
        System.out.println("Number is updated to: " + num);


        input.close();
    }
}

package Assessment;
import java.util.Scanner;
public class exercise3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int grade = 0;

        System.out.print("Enter your result: ");
        grade = input.nextInt();

        if(grade >= 90){
            System.out.println("Grade: A");
        }else if(grade >= 70 && grade < 90){
            System.out.println("Grade: B");
        }else if(grade >= 50 && grade < 70){
            System.out.println("Grade: C");
        }else if(grade < 50){
            System.out.println("Grade: F");
        }else{
            System.out.println("The number entered is invalid");
        }

        input.close();
    }
}

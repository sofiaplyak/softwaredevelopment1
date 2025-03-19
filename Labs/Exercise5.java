package Labs;
import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int result = 0;
        boolean part = false;
        boolean sub = false;
        String grade = "";
        String postfix = "";

        System.out.print("Enter a result: ");
        result = input.nextInt();

        if(result >= 50){
            System.out.print("Did student fully participate (true/false): ");
            part = input.nextBoolean();
            System.out.print("Did student submit all projects (true/false): ");
            sub = input.nextBoolean();
            if(sub && part){
                postfix = "+";
            }else if(!sub && !part){
                postfix = "-";
            }
        }
        if(result >= 90 && result <= 100){
            grade = "A";
        }else if(result >= 70 && result < 90){
            grade = "B";
        }else if(result >= 50 && result < 70){
            grade = "C";
        }else if(result >= 40 && result < 50){
            grade = "D";
        }
        System.out.println("Grade: " + (grade + postfix));




        input.close();
    }
    
}

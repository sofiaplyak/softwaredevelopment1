package Exampract;
import java.util.Scanner;
public class grades2 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int grade = 0;
    int total = 0;
    int counter = 0;

    while(grade != -1){
        System.out.print("Enter number (-1 to quit): ");
        grade = input.nextInt();
        if(grade != -1){
            total += grade;
            counter++;
        }
    }
    if(counter != 0){
        System.out.println("total: " + (total / counter * 1.0));
    }else{
        System.out.println("NO GRADES ENTERED");
    }
    
    input.close();
    }
}

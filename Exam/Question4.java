package Exam;
import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);//inputs scanner with the name "input"
        //System.out.println("Exercise 1");
        String text = " ";

        System.out.print("Enter some text: ");
        text = input.nextLine();
        
        for(int i = 0; i < text.length(); i++){
            System.out.println(text.charAt(i));
        }
       
        input.close();
    }
}
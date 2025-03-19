package Exam;
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);//inputs scanner with the name "input"
       
        String text = "";
        System.out.print("Enter some text: ");
        text = input.nextLine();

        for(int i =1; i <=12; i++){
            System.out.println(text);
        }
        input.close();
    }
}
package Exam;

import java.util.Scanner;
public class solution2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = 0;
        int times = 12;
        System.out.print("Enter a number: ");
        num = input.nextInt();
        if(num >= 3){
            times = 6;
        }

        for(int i = 1; i <= times; i++){
            System.out.println(i + ". Question2");
        }
        input.close();
    }
}

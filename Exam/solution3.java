package Exam;

import java.util.Scanner;
public class solution3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 1;
        int count = 0;


        while(number > 0){
            System.out.println("Enter a positive number (enter value less than 1 to stop): ");
            number = input.nextInt();
            if(number > 0){
                count++;
            }
        }

        System.out.println("You entered " + count + " positive numbers");






        input.close();
    }
}
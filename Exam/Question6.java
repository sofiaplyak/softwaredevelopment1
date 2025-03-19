package Exam;
import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //System.out.println("Exercise 1");
        System.out.println("Part a:\n------");//prints part a
        for(int rows = 1; rows <= 2; rows++){
            System.out.print("line " + rows + ": ");// prints first line and digits to it
            for (int cols = 1; cols <= 2; cols++){
                System.out.print(cols + " ");// prints columns
            }
            System.out.println();
        }

        System.out.println("\nPart b:\n------");
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < i; j++){// conditions for the loop
                System.out.print(" *");
            }
            System.out.println();
        }
        input.close();
    }
}
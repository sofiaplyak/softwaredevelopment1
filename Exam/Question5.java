package Exam;
import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);//inputs scanner with the name "input"
        
        System.out.println("Part a:\n------");
        for(int rows = 1; rows <= 2; rows++){
            System.out.print("r" + rows );
            for (int cols = 1; cols <= 2; cols++){
                System.out.print("c" + cols );
            }
            System.out.println();
        }

// sorry i really could not figure out how to do that r and c stands together



        System.out.println("\nPart b:\n------");
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        input.close();
    }
}
package Exam;   
import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);//inputs scanner with the name "input"
        int number = 0;
        int count = 1;
      
        System.out.print("Enter number : ");
        number = input.nextInt();    //inputs number 
     
        if(number >= 3){ //states that number should be more or equal 3
        while(count <= 6 ){
            System.out.println("Question 2"); //prints question 2
            count++;   // create loop
        }
        }else{
            while(count <= 12 ){//condition that crete 12 loops
                System.out.println("Question 2");
                count++;  
        } 
            
    } 
       
    
        
        input.close();
    }
}


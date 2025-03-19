package Exampract;
import java.util.Scanner;

public class rectangle {
    
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in); 
        int length = -1, width = -1;
        while(length > 20 || length < 0){
            System.out.print("Ener the length: ");
            length = input.nextInt();
        }
        do{
            System.out.print("Ener the width: ");
            width = input.nextInt();
        } while(length > 20 || length < 0);
           
        
        

        for(int i = 0; i < length; i++){
            for(int j = 0; j < width; j++){
                System.out.print("𝐬 ");
            }
            System.out.println();
        }
        input.close();
    }


}

package Arrays;
import java.util.Scanner;
public class sixarray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numbr = 0;
        int found = -1;
        int[] x = {54, 100, 77, 10408};
        System.out.print("Enter a number: ");
        numbr = input.nextInt();
        for(int i = 0; i < x.length; i++){
            if(x[i] == numbr){
                found = i;
            }
        }
        if(found > -1){
            System.out.println("Number found at index: " + found);
        }else{
            System.out.println("Number not found");
        }

        input.close();
    }
}



/*
 * y[0] = x[4]
 * y[1] = x[3]
 * y[2] = x[2]
 * y[3] = x[1]
 * y[4] = x[0]
 */
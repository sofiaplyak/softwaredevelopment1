package Arrays;
import java.util.Scanner;
public class eightarray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] x = {23, 104, 3, 65, 1002, 90000, 77, 88, 99, 10};
        int val = 0;
        int found = -1;
        int[] y = new int[x.length - 1];

        System.out.print("Enter number to remove from array: ");
        val = input.nextInt();

        for(int i = 0; i < x.length; i++){
            if(x[i] == val){
                found = i;
            }
        }
        if(found > -1){
            // value is found
            for(int i = 0, index = 0; i < x.length; i++){
                if(i != found){
                    y[index++] = x[i];
                }
            }
            for(int i =0; i < y.length; i++){
                
                System.out.println(y[i]);
            }
        }else{
            System.out.println(val + " not found in array");
        }
        

        input.close();
    }
}

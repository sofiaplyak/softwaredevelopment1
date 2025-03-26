package Arrays;

public class fourtharray {
    public static void main(String[] args) {
        int[] x = {7, 6, 11, 15, 19};
        int total = 0; 
        int index = 0;
        while(index < x.length - 1){
            System.out.print(x[index] + " + ");
            total += x[index];
            index++;
        }
        total += x[index];
        System.out.println(x[index] + " = " + total);
        System.out.println("Sum of array values is: " + total);
    }
}

package Labs;
public class Product {
    public static void main(String[] args) {
        int counter = 1;
        int product = 1;

        while(counter <= 10){
            product *= counter;
            counter++;
        }
        System.out.println("The product of numbers from 1 to 10 is: " + product);
    }
}

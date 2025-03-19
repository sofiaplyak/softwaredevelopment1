package Labs;
public class SquaresArithmetic {
    public static void main(String[] args) {
        int total = 0;
        int count = 0;
        while (count <= 10){
            System.out.println(count + " * " + count + " = " + (count * count));
            total += (count * count);
            count++;
        }
        System.out.println("Total: " + total);
    }
}

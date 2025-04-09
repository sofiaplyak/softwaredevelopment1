package Assessment;

public class exercise5 {
    public static void main(String[] args) {
        int[] x = {20, 30, 40, 50};

        System.out.println("Index\tValue\n-----\t-----");
        for(int i = 0; i <x.length; i++){
            System.out.println(i + "\t" + x[i]);
        }

        int sum = 0;
        for(int j = 0; j < x.length; j++){
            sum += x[j];
        }
        System.out.println("Total: " + sum);

        int n = x.length;
        double avg = sum / n;
        System.out.println("Average: " + avg);

        int product = x[0]*x[1]*x[2]*x[3];
        System.out.println("Product: " + product); 
    }
}

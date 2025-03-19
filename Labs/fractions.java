package Labs;
public class fractions {
    public static void main(String[] args) {
        double sum = 0;
        int i = 0;
        double term = 1.0;
        while(i <= 10){
            sum = sum + term;
            term = 0.5 * term;
            i++;
        }
        System.out.println(sum);


        sum = 0;
        i = 1;
        term = 0;
        while( i <= 10){
            term = 1.0/(i*i*i);
            sum += term;
            i++;
        }
        System.out.println(sum);
    }
}

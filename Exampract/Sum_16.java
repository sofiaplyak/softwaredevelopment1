package Exampract;
public class Sum_16 {
    public static void main(String[] args) {
        int i = 1;
        int even = 0;
        int odd = 0;
        int diff = 0;
        int sum = 0;


        while(i <= 100){
             sum += i;
             if(i%2 == 0){
                even += i;
             }else{
                odd += i;
             }
            i++;
        }


        System.out.println("sum total: " + sum);
        System.out.println("even total: " + even);
        System.out.println("odd total: " + odd);
        if(odd > even){
            diff = odd - even;
        }else{
            diff = even - odd;
        }
        System.out.println("Diff: " + diff);
    }
}

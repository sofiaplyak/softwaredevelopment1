package Assessment;

public class sample4 {
    public static void main(String[] args) {
        int num = 8;
        for(int i = 0; i < 4; i++){
            for(int j = 1; j <=4; j++){
                System.out.print((num += 2) + " ");
            }
            System.out.println();
        }
    }
}

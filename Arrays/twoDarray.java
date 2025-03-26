package Arrays;

public class twoDarray {
    public static void main(String[] args) {
        int[] [] x = {{1,2}, {3,4}};

        System.out.println("Content of array accessed using a for loop: ");
        for(int i = 0; i < x.length; i++){
            for(int y = 0; y < x[i].length; y++){
                System.out.println(x[i][y]);
            }
        }
    }
}

public class Array{
    public static void main(String[] args) {
        int [] [] array1 = {{1,2,3}, {4,5,6}};
        int [] [] array2 = {{1,2}, {3}, {4,5,6}};

        System.out.println("Values in first array by rows: ");
        outputArray(array1);
        System.out.println();
        System.out.println("Values in second array by rows: ");
        outputArray(array2);
        System.out.println();
    }

    public static void outputArray(int[][] array){
        for(int row = 0; row <array.length; row++){
            for(int column = 0; column < array[row].length; column++){
                System.out.print(array[row][column] + " ");
            }
            System.out.println();
        }
    }

    
}
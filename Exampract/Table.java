package Exampract;
public class Table {
    public static void main(String[] args) {
        int counter = 0;
        int vals = 10;
        System.out.println("Number\tSquare\tCube");
        while(counter <= vals){
            System.out.println(counter + "\t" + (counter * counter) + "\t" + (counter * counter * counter));
            counter++;
        }
    }
}

package Labs;
public class SoftDevOne {
    public static void main(String[] args) {
        int counter = 1;
        while(counter <= 30){
            if(counter == 4){
                System.out.print(" Soft ");
            }else if(counter == 15){
                System.out.print("Dev ");
            }else if(counter == 21){
                System.out.print("One ");
            }else if(counter == 29){
                System.out.print("SoftDevOne ");
            }else {
                System.out.print(counter + " ");
            }
            counter++;
        }
        System.out.println();
    }
}

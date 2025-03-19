package Labs;
import java.util.Scanner;

public class Month {
    public static void main(String[] args) {
        Scanner varenyky = new Scanner(System.in);

        int month = 0;

        System.out.print("Enter a number from 1 to 12: ");
        month = varenyky.nextInt();

        if (month == 1){
            System.out.println("--- JANUARY ---");
        }else if( month == 2){
            System.out.println("--- FEBRUARY ---");
        }else if(month == 3){
            System.out.println("--- MARCH ---");
        }else if(month == 4){
            System.out.println("--- APRIL ---");
        }else if(month == 5){
            System.out.println("--- MAY ---");
        }else if(month == 6){
            System.out.println("--- JUNE ---");
        }else if(month == 7){
            System.out.println("--- JULY ---");
        }else if(month == 8){
            System.out.println("--- AUGUST ---");
        }else if(month == 9){
            System.out.println("--- SEPTEMBER ---");
        }else if(month == 10){
            System.out.println("--- OCTOBER ---");
        }else if(month == 11){
            System.out.println("--- NOVEMBER ---");
        }else if(month == 12){
            System.out.println("--- DECEMBER ---");
        }else if(month > 12){
            System.out.println("--- Month Unknown ---");
        }
           

        varenyky.close();
    }
}

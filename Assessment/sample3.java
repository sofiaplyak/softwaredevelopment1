package Assessment;
import java.util.Scanner;
public class sample3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age;
        System.out.print("Enter age: "); //enter age
        age = input.nextInt();

        if(age >= 65){
            System.out.println("Senior citizen");
        }else if(age >= 20){
            System.out.println("Adult");
        }else if(age >= 13){
            System.out.println("Teenager");
        }else if(age>=4){
            System.out.println("Child");
        }else if(age>=1){
            System.out.println("Toddler");
        }else if(age>0){
            System.out.println("JUST A BABYYY");
        }else{
            System.out.println(age + " is not a valid age");
        }


        input.close();
    }
}

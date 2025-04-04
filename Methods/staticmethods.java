package Methods;
import java.util.Scanner;
public class staticmethods {
    public static void main(String[] args) {
       
       Scanner input = new Scanner(System.in);//
        method1();

        System.out.println();

        method2();

        System.out.println();

        method3(4);

        System.out.println();

        method4(5,7 );

        System.out.println();

        method5(67, 998, 54);

        System.out.println();

        method6("Sofia", "Peslyak");

        System.out.println();

        method7("Sofia", 18);

        System.out.println();

        System.out.println("Method8 returned a value of " + method8() + " to me");

        System.out.println();

        String s = method9("Sofia ", "Peslyak");
        System.out.println("Fullname: " + s) ;

        System.out.println();

        int sum = method10(4, 6, 10);
        System.out.println("The returned value: " + sum);

        input.close();
    }




// methods layout //

    static void method1(){
        System.out.println("Hello from method1");
    }

    static void method2(){
        System.out.println("Hello from method2");
    }

    static void method3(int value){
       System.out.println("You passed me, method 3, an integer value of: " + value); 
    }

    static void method4(int num1, int num2){
        System.out.println("You passed me, method 4, integer values of: " + num1 + " and " + num2); 
    }

    static void method5(int num1, int num2, int num3){
        System.out.println("You passed me, method 5, integer values of: " + num1 + ", " + num2 + " and " + num3); 
    }

    static void method6(String firstname, String lastname){
        System.out.println("You passed me, method 6, the name: " + firstname + " " + lastname);
    }

    static void method7(String name, int number){
        System.out.println("You passed me, method 7, the name " + name + " and the number " + number);
    }

    static int method8(){
        return 100;
    }

    static String method9(String fname, String lname){
        return fname + lname;
    }

    static int method10(int n1, int n2, int n3){
        return n1+n2+n3;
    }
     
    
}
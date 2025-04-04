package Methods;
import java.util.Scanner;
public class instancemethods {
    public static void main(String[] args) {
        instancemethods im = new instancemethods();
       Scanner input = new Scanner(System.in);//
        im.method1();

        System.out.println();

        im.method2();

        System.out.println();

        im.method3(4);

        System.out.println();

        im.method4(5,7 );

        System.out.println();

        im.method5(67, 998, 54);

        System.out.println();

        im.method6("Sofia", "Peslyak");

        System.out.println();

        im.method7("Sofia", 18);

        System.out.println();

        System.out.println("Method8 returned a value of " + im.method8() + " to me");

        System.out.println();

        String s = im.method9("Sofia ", "Peslyak");
        System.out.println("Fullname: " + s) ;

        System.out.println();

        int sum = im.method10(4, 6, 10);
        System.out.println("The returned value: " + sum);

        input.close();
    }




// methods layout //

    void method1(){
        System.out.println("Hello from method1");
    }

    void method2(){
        System.out.println("Hello from method2");
    }

    void method3(int value){
       System.out.println("You passed me, method 3, an integer value of: " + value); 
    }

    void method4(int num1, int num2){
        System.out.println("You passed me, method 4, integer values of: " + num1 + " and " + num2); 
    }

    void method5(int num1, int num2, int num3){
        System.out.println("You passed me, method 5, integer values of: " + num1 + ", " + num2 + " and " + num3); 
    }

    void method6(String firstname, String lastname){
        System.out.println("You passed me, method 6, the name: " + firstname + " " + lastname);
    }

    void method7(String name, int number){
        System.out.println("You passed me, method 7, the name " + name + " and the number " + number);
    }

    int method8(){
        return 100;
    }

    String method9(String fname, String lname){
        return fname + lname;
    }

    int method10(int n1, int n2, int n3){
        return n1+n2+n3;
    }
     
    
}
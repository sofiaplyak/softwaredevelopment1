package Labs;
public class Operators {
    public static void main(String[] args) {
        int x = 100;

        System.out.println("Number: " + x);//100
        x += 5;
        System.out.println("Number: " + x);//105
        x++;
        System.out.println("Number: " + x);//
        x--;
        System.out.println("Number: " + x);//
        x -= 5;
        System.out.println("Number: " + x);//100
        System.out.println("Number: " + (x++));//100
        System.out.println("Number: " + (++x));//102
        System.out.println("Number: " + (x--));//102
        System.out.println("Number: " + (--x));//100

    }
}

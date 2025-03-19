package Labs;
public class Swap {
    public static void main(String[] args) {
        
        String a = "Test";
        String b = "Java";

        a += b;
        System.out.println(a.length() - b.length());
        b = a.substring(0, a.length() - b.length());
        System.out.println("b: " + b);

        System.out.println("a: " + a.substring(a.length() - b.length() - 1));
    }
}

package Methods;
public class methods{
    public static void main(String[] args) {
      methods m = new methods();
      m.hello();

      String s = m.greet();
      System.out.println(s);

      System.out.println(m.one());

      m.myPrinter("Giving my printer a go");

      m.numbers(200,300);

      System.out.println(m.add(3,4));
    }
    

    // methods making 
    void hello(){
        System.out.println("Hello there");
    }

    String greet(){
        return "Good evening ";
    }

    int one(){
        return 1;
    }

    void myPrinter(String data){
        System.out.println(data);
    }

    void numbers(int first, int second){
        System.out.println(first + " and " + second);
    }

    int add(int x, int y){
        return x + y;
    }
}
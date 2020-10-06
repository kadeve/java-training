public class exercise1 {
    public static void main(String[] args) {
    int a = 15,b = 25,c;
        System.out.println("a : " + a);
        System.out.println("b : " + b);

        c = a;
    a = b;
    b = c;
    System.out.println("a : " + a);
    System.out.println("b : " + b);
    }
}
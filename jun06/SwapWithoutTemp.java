public class SwapWithoutTemp {
    public static void main(String[] args) {
        int a = 15, b = 25;

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
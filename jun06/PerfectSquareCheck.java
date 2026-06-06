public class PerfectSquareCheck {
    public static void main(String[] args) {
        int num = 64;

        int root = (int)Math.sqrt(num);

        if(root * root == num)
            System.out.println("Perfect Square");
        else
            System.out.println("Not Perfect Square");
    }
}
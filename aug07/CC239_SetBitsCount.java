public class CC239_SetBitsCount {

    public static void main(String[] args) {

        int num = 29;

        int count = 0;

        while (num > 0) {
            count += num & 1;
            num >>= 1;
        }

        System.out.println(count);
    }
}
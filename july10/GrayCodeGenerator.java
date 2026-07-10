public class GrayCodeGenerator {

    public static void main(String[] args) {

        int n=4;

        for(int i=0;i<(1<<n);i++){

            int gray=i^(i>>1);

            System.out.println(Integer.toBinaryString(gray));
        }
    }
}
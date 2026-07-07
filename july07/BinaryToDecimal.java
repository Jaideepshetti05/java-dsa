public class BinaryToDecimal {
    public static void main(String[] args) {
        String binary = "101101";
        int decimal = Integer.parseInt(binary, 2);
        System.out.println(decimal);
    }
}
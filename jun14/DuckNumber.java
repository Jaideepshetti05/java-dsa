public class DuckNumber {
    public static void main(String[] args) {
        int num = 1023;
        String s = String.valueOf(num);

        if (s.contains("0") && s.charAt(0) != '0')
            System.out.println("Duck Number");
        else
            System.out.println("Not Duck Number");
    }
}
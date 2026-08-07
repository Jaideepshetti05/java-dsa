public class CC235_CountUpperLower {
    public static void main(String[] args) {

        String str = "JaVa ProGramMing";

        int upper = 0, lower = 0;

        for (char ch : str.toCharArray()) {

            if (Character.isUpperCase(ch))
                upper++;
            else if (Character.isLowerCase(ch))
                lower++;
        }

        System.out.println("Upper = " + upper);
        System.out.println("Lower = " + lower);
    }
}
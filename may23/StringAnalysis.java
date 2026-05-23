public class StringAnalysis {
    public static void main(String[] args) {

        String str = "Java Programming 2026";
        int vowels = 0, digits = 0, spaces = 0;

        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if("aeiouAEIOU".indexOf(ch) != -1)
                vowels++;

            else if(Character.isDigit(ch))
                digits++;

            else if(ch == ' ')
                spaces++;
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Digits: " + digits);
        System.out.println("Spaces: " + spaces);
    }
}
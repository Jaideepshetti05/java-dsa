public class CountVowelsConsonants {

    public static void main(String[] args) {

        String s = "Artificial Intelligence".toLowerCase();

        int vowels = 0, cons = 0;

        for (char c : s.toCharArray()) {

            if (Character.isLetter(c)) {
                if ("aeiou".indexOf(c) >= 0)
                    vowels++;
                else
                    cons++;
            }
        }

        System.out.println(vowels);
        System.out.println(cons);
    }
}
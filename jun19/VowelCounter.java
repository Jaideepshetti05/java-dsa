public class VowelCounter {
    public static void main(String[] args) {
        String text = "Cloud Computing";

        int count = 0;

        for(char ch : text.toLowerCase().toCharArray()){
            if("aeiou".indexOf(ch)!=-1)
                count++;
        }

        System.out.println("Vowels: " + count);
    }
}
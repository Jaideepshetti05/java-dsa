public class FindLargestWord {
    public static void main(String[] args) {
        String str = "Java programming language";

        String[] words = str.split(" ");
        String largest = "";

        for(String word : words) {
            if(word.length() > largest.length())
                largest = word;
        }

        System.out.println(largest);
    }
}
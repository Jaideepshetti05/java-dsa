public class FindLargestWord {
    public static void main(String[] args) {
        String str = "Java Python Kubernetes Terraform";

        String[] words = str.split(" ");

        String largest = words[0];

        for(String word : words){
            if(word.length() > largest.length())
                largest = word;
        }

        System.out.println(largest);
    }
}
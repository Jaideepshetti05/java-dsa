public class CountWords {

    public static void main(String[] args){

        String s="Java is a powerful programming language";

        System.out.println(s.trim().split("\\s+").length);

    }
}
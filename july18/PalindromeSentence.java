public class PalindromeSentence {

    public static void main(String[] args){

        String s="Madam In Eden Im Adam";

        s=s.replaceAll("[^a-zA-Z]","").toLowerCase();

        String rev=new StringBuilder(s).reverse().toString();

        System.out.println(s.equals(rev));
    }
}
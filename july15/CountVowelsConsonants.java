public class CountVowelsConsonants{
    public static void main(String[] args){

        String s="Artificial Intelligence";

        int v=0,c=0;

        for(char ch:s.toLowerCase().toCharArray()){
            if(Character.isLetter(ch)){
                if("aeiou".indexOf(ch)>=0)
                    v++;
                else
                    c++;
            }
        }

        System.out.println("Vowels="+v);
        System.out.println("Consonants="+c);
    }
}
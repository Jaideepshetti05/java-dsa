public class CharacterFrequency {
    public static void main(String[] args) {
        String str = "banana";
        char target = 'a';

        int count = 0;

        for(char ch : str.toCharArray()){
            if(ch == target)
                count++;
        }

        System.out.println(count);
    }
}
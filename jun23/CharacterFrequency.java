public class CharacterFrequency {
    public static void main(String[] args) {
        String str = "java";

        for(char c : str.toCharArray()) {
            int count = 0;

            for(char d : str.toCharArray()) {
                if(c == d)
                    count++;
            }

            System.out.println(c + " : " + count);
        }
    }
}
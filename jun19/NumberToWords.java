public class NumberToWords {
    public static void main(String[] args) {
        String[] words = {"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
        int num = 528;

        String str = String.valueOf(num);

        for(char c : str.toCharArray()){
            System.out.print(words[c - '0'] + " ");
        }
    }
}
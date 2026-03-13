public class RemoveVowels {
    public static void main(String[] args){
        String str = "programming";
        String result = str.replaceAll("[aeiouAEIOU]", "");
        System.out.println(result);
    }
}
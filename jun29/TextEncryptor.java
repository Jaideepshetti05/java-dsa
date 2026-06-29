import java.util.Scanner;

public class TextEncryptor {

    public static String encrypt(String text, int key) {

        StringBuilder sb = new StringBuilder();

        for (char ch : text.toCharArray()) {

            if (Character.isLetter(ch)) {

                char base = Character.isUpperCase(ch) ? 'A' : 'a';

                sb.append((char) ((ch - base + key) % 26 + base));

            } else {
                sb.append(ch);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Text: ");
        String text = sc.nextLine();

        System.out.print("Enter Key: ");
        int key = sc.nextInt();

        System.out.println("Encrypted Text: " + encrypt(text, key));

        sc.close();
    }
}
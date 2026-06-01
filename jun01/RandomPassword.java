import java.util.Random;

public class RandomPassword {
    public static void main(String[] args) {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random r = new Random();

        StringBuilder pass = new StringBuilder();

        for(int i=0;i<8;i++)
            pass.append(chars.charAt(r.nextInt(chars.length())));

        System.out.println("Password: " + pass);
    }
}
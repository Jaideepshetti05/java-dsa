import java.util.Random;

public class RandomPassword {

    public static void main(String[] args){

        String chars="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz123456789";

        Random r=new Random();

        StringBuilder sb=new StringBuilder();

        for(int i=0;i<10;i++)
            sb.append(chars.charAt(r.nextInt(chars.length())));

        System.out.println(sb);
    }
}
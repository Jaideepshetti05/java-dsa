import java.util.Scanner;

public class IPAddressValidator {

    public static boolean isValidIP(String ip) {

        String[] parts = ip.split("\\.");

        if (parts.length != 4)
            return false;

        for (String part : parts) {
            try {
                int num = Integer.parseInt(part);

                if (num < 0 || num > 255)
                    return false;

            } catch (NumberFormatException e) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter IP Address: ");
        String ip = sc.nextLine();

        if (isValidIP(ip))
            System.out.println("Valid IP Address");
        else
            System.out.println("Invalid IP Address");

        sc.close();
    }
}
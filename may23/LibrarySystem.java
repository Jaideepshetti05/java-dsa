import java.util.Scanner;

public class LibrarySystem {

    public static void main(String[] args) {

        String books[] = {"Java", "Python", "Cloud", "DevOps"};
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter book name: ");
        String search = sc.nextLine();

        boolean found = false;

        for(String book : books) {
            if(book.equalsIgnoreCase(search)) {
                found = true;
                break;
            }
        }

        if(found)
            System.out.println("Book Available");
        else
            System.out.println("Book Not Available");
    }
}
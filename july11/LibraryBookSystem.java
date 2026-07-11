import java.util.*;

public class LibraryBookSystem{

    public static void main(String[] args){

        ArrayList<String> books=new ArrayList<>();

        books.add("Java");
        books.add("Python");

        books.remove("Java");

        System.out.println(books);
    }
}
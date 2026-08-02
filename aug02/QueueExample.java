import java.util.*;

public class QueueExample {

    public static void main(String[] args) {

        Queue<String> q = new LinkedList<>();

        q.add("A");
        q.add("B");
        q.add("C");

        while (!q.isEmpty())
            System.out.println(q.poll());
    }
}
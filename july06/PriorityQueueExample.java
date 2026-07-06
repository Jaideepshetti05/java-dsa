import java.util.PriorityQueue;

public class PriorityQueueExample {

    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(40);
        pq.add(5);
        pq.add(30);
        pq.add(15);

        while(!pq.isEmpty())
            System.out.println(pq.poll());
    }
}
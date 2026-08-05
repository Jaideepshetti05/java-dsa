public class ArrayQueue {

    int[] queue = new int[5];
    int front = 0;
    int rear = -1;
    int size = 0;

    void enqueue(int value) {
        if (size == queue.length) {
            System.out.println("Queue Overflow");
            return;
        }

        rear++;
        queue[rear] = value;
        size++;
    }

    void dequeue() {
        if (size == 0) {
            System.out.println("Queue Underflow");
            return;
        }

        System.out.println("Removed: " + queue[front]);
        front++;
        size--;
    }

    void display() {
        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        ArrayQueue q = new ArrayQueue();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        q.display();

        q.dequeue();

        q.display();
    }
}
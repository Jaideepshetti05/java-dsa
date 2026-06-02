package jun02;

public class QueueUsingArray {
    private int front, rear, size;
    private int capacity;
    private int[] array;

    public QueueUsingArray(int capacity) {
        this.capacity = capacity;
        front = this.size = 0;
        rear = capacity - 1;
        array = new int[this.capacity];
    }

    // Queue is full when size becomes equal to the capacity
    public boolean isFull() {
        return (this.size == this.capacity);
    }

    // Queue is empty when size is 0
    public boolean isEmpty() {
        return (this.size == 0);
    }

    // Method to add an item to the queue. It changes rear and size
    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue Overflow");
            return;
        }
        this.rear = (this.rear + 1) % this.capacity;
        this.array[this.rear] = item;
        this.size = this.size + 1;
        System.out.println(item + " enqueued to queue");
    }

    // Method to remove an item from queue. It changes front and size
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow");
            return Integer.MIN_VALUE;
        }
        int item = this.array[this.front];
        this.front = (this.front + 1) % this.capacity;
        this.size = this.size - 1;
        return item;
    }

    // Method to get front of queue
    public int getFront() {
        if (isEmpty()) return Integer.MIN_VALUE;
        return this.array[this.front];
    }

    // Method to get rear of queue
    public int getRear() {
        if (isEmpty()) return Integer.MIN_VALUE;
        return this.array[this.rear];
    }

    public void printQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.print("Queue elements: ");
        for (int i = 0; i < this.size; i++) {
            System.out.print(this.array[(this.front + i) % this.capacity] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        QueueUsingArray queue = new QueueUsingArray(1000);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);

        queue.printQueue();

        System.out.println(queue.dequeue() + " dequeued from queue");
        System.out.println("Front item is " + queue.getFront());
        System.out.println("Rear item is " + queue.getRear());
        queue.printQueue();
    }
}

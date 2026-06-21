class CircularQueue {
    int[] arr = new int[5];
    int front = -1, rear = -1;

    void enqueue(int data) {
        if ((rear + 1) % arr.length == front) {
            System.out.println("Queue Full");
            return;
        }
        if (front == -1) front = 0;
        rear = (rear + 1) % arr.length;
        arr[rear] = data;
    }

    void display() {
        int i = front;
        while (true) {
            System.out.print(arr[i] + " ");
            if (i == rear) break;
            i = (i + 1) % arr.length;
        }
    }

    public static void main(String[] args) {
        CircularQueue q = new CircularQueue();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.display();
    }
}
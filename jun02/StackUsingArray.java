package jun02;

public class StackUsingArray {
    private static final int MAX = 1000;
    private int top;
    private int[] a = new int[MAX]; // Maximum size of Stack

    public boolean isEmpty() {
        return (top < 0);
    }

    public StackUsingArray() {
        top = -1;
    }

    public boolean push(int x) {
        if (top >= (MAX - 1)) {
            System.out.println("Stack Overflow");
            return false;
        } else {
            a[++top] = x;
            System.out.println(x + " pushed into stack");
            return true;
        }
    }

    public int pop() {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            int x = a[top--];
            return x;
        }
    }

    public int peek() {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            int x = a[top];
            return x;
        }
    }

    public void printStack() {
        System.out.print("Stack elements: ");
        for (int i = top; i >= 0; i--) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        StackUsingArray s = new StackUsingArray();
        s.push(10);
        s.push(20);
        s.push(30);
        s.printStack();
        System.out.println(s.pop() + " Popped from stack");
        System.out.println("Top element is : " + s.peek());
        s.printStack();
    }
}

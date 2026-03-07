class StackUsingArray {
    int[] stack = new int[5];
    int top = -1;

    void push(int x){
        stack[++top] = x;
    }

    int pop(){
        return stack[top--];
    }

    public static void main(String[] args) {
        StackUsingArray s = new StackUsingArray();
        s.push(10);
        s.push(20);
        System.out.println(s.pop());
    }
}
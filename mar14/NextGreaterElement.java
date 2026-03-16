import java.util.*;

public class NextGreaterElement {
    public static void main(String[] args) {
        int[] arr = {4,5,2,25};
        Stack<Integer> stack = new Stack<>();

        stack.push(arr[0]);

        for(int i=1;i<arr.length;i++){
            int next = arr[i];

            while(!stack.isEmpty() && stack.peek() < next){
                System.out.println(stack.pop() + " -> " + next);
            }

            stack.push(next);
        }

        while(!stack.isEmpty()){
            System.out.println(stack.pop() + " -> -1");
        }
    }
}
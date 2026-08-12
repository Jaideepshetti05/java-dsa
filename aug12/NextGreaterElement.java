import java.util.*;

public class NextGreaterElement {
    public static void main(String[] args) {
        int[] arr = { 4, 5, 2, 10, 8 };

        int[] result = new int[arr.length];
        Arrays.fill(result, -1);

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            while (!stack.isEmpty() && arr[i] > arr[stack.peek()]) {
                result[stack.pop()] = arr[i];
            }

            stack.push(i);
        }

        System.out.println(Arrays.toString(result));
    }
}
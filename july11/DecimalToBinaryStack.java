import java.util.*;

public class DecimalToBinaryStack{
    public static void main(String[] args){

        int n=45;

        Stack<Integer> stack=new Stack<>();

        while(n>0){
            stack.push(n%2);
            n/=2;
        }

        while(!stack.isEmpty())
            System.out.print(stack.pop());
    }
}
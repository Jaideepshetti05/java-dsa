import java.util.*;

public class BalancedParentheses {

    public static void main(String[] args){

        String s="{[()]}";

        Stack<Character> st=new Stack<>();

        for(char ch:s.toCharArray()){

            if(ch=='('||ch=='{'||ch=='[')
                st.push(ch);

            else{

                char t=st.pop();

                if((t=='('&&ch!=')')||
                        (t=='{'&&ch!='}')||
                        (t=='['&&ch!=']')){

                    System.out.println("Not Balanced");
                    return;
                }
            }
        }

        System.out.println(st.isEmpty()?"Balanced":"Not Balanced");
    }
}
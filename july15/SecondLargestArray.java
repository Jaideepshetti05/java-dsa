public class SecondLargestArray{
    public static void main(String[] args){

        int[] arr={10,25,8,42,30};

        int first=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;

        for(int n:arr){
            if(n>first){
                second=first;
                first=n;
            }else if(n>second && n!=first){
                second=n;
            }
        }

        System.out.println(second);
    }
}
public class SecondLargest {

    public static void main(String[] args) {

        int[] arr={11,8,45,22,90};

        int first=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;

        for(int x:arr){

            if(x>first){
                second=first;
                first=x;
            }else if(x>second && x!=first){
                second=x;
            }

        }

        System.out.println(second);
    }
}
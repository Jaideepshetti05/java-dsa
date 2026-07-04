public class ArmstrongRange {
    public static void main(String[] args) {
        for(int num=1; num<=1000; num++){
            int temp=num,sum=0,digits=String.valueOf(num).length();

            while(temp>0){
                int rem=temp%10;
                sum+=Math.pow(rem,digits);
                temp/=10;
            }

            if(sum==num)
                System.out.print(num+" ");
        }
    }
}
public class LargestElement {
    public static void main(String[] args){
        int[] arr = {4,7,2,9,1};
        int max = arr[0];

        for(int num : arr){
            if(num > max)
                max = num;
        }

        System.out.println("Largest: " + max);
    }
}
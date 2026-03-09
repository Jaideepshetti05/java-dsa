public class BinarySearch {
    public static void main(String[] args) {

        int arr[] = {2,4,6,8,10,12};
        int key = 8;

        int left = 0;
        int right = arr.length-1;

        while(left <= right){

            int mid = (left+right)/2;

            if(arr[mid] == key){
                System.out.println("Found at index " + mid);
                return;
            }

            if(arr[mid] < key)
                left = mid+1;
            else
                right = mid-1;
        }

        System.out.println("Not Found");
    }
}
public class BinarySearchRecursive {

    static int binarySearch(int[] arr, int l, int r, int key){
        if(l <= r){
            int mid = (l+r)/2;

            if(arr[mid] == key) return mid;

            if(arr[mid] > key)
                return binarySearch(arr,l,mid-1,key);

            return binarySearch(arr,mid+1,r,key);
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9};
        System.out.println(binarySearch(arr,0,arr.length-1,7));
    }
}
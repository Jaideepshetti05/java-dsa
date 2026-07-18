public class BinarySearchRecursive {

    static int search(int[] arr,int l,int h,int key){
        if(l>h) return -1;
        int m=(l+h)/2;

        if(arr[m]==key) return m;
        if(key<arr[m]) return search(arr,l,m-1,key);
        return search(arr,m+1,h,key);
    }

    public static void main(String[] args){
        int[] arr={2,5,7,9,13,20};

        System.out.println(search(arr,0,arr.length-1,13));
    }
}
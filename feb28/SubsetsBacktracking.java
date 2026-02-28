import java.util.*;

public class SubsetsBacktracking {

    static void subsets(int[] nums, int index, List<Integer> curr) {
        System.out.println(curr);
        for(int i=index;i<nums.length;i++){
            curr.add(nums[i]);
            subsets(nums, i+1, curr);
            curr.remove(curr.size()-1);
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        subsets(nums,0,new ArrayList<>());
    }
}
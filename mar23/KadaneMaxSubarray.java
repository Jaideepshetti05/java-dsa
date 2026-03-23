class KadaneMaxSubarray {
    public static int maxSub(int[] nums) {
        int max = nums[0], curr = nums[0];
        for(int i=1;i<nums.length;i++){
            curr = Math.max(nums[i], curr + nums[i]);
            max = Math.max(max, curr);
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(maxSub(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }
}class KadaneMaxSubarray {
    public static int maxSub(int[] nums) {
        int max = nums[0], curr = nums[0];
        for(int i=1;i<nums.length;i++){
            curr = Math.max(nums[i], curr + nums[i]);
            max = Math.max(max, curr);
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(maxSub(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }
}
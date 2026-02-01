class searchInsertPosition {
    public static int searchInsert(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        while (high >= low)
        {
            int mid = low + (high - low)/2;
            if (nums[mid] == target)
                return mid;
            if (nums[mid] > target)
                high = mid - 1;
            else 
                low = mid + 1;
        }
        return low;        
    }

    public static void main(String Args[])
    {
        int nums[] = {1,3,5,6}, target = 7;
        int result = searchInsert(nums, target);
        System.out.println(result);
    }
}

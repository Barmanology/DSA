class Solution {
    public static int search(int[] nums, int target) {
        
        int low = 0, high = (nums.length - 1);

        while(high >= low)
        {
            int mid = low + (high - low)/2;

            if (nums[mid] == target)
                return mid;
            if (nums[mid] > target)
                high = mid - 1;
            else
                low = mid + 1;

        }

        return -1;

    }

    public static void main(String Args[])
    {
        int nums[] = {-1,0,3,5,9,12};
        int target = 9;

        int result = search(nums, target);
        System.out.println(result);
    }
}

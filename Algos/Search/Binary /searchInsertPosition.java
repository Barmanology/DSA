/******WRONG ALGORITHM******/

// class searchInsertPosition {
//     public static int searchInsert(int[] nums, int target) {
//         int low = 0, high = nums.length - 1;
//         while (high >= low)
//         {
//             int mid = low + (high - low)/2;
//             if (nums[mid] == target)
//                 return mid;
//             if (nums[mid] > target)
//                 high = mid - 1;
//             else 
//                 low = mid + 1;
//         }
//         return low;        
//     }

//     public static void main(String Args[])
//     {
//         int nums[] = {1,3,5,6}, target = 7;
//         int result = searchInsert(nums, target);
//         System.out.println(result);
//     }
// }


/*********USING STATIC METHOD */

// class Solution {
//     public static int searchInsert(int[] nums, int target) {
//         int low = 0, high = nums.length - 1, ans = nums.length;
//         while (high >= low)
//         {
//             int mid = low + (high - low)/2;
//             if (nums[mid] >= target)
//             {
//                 ans = mid;
//                 high = mid - 1;
//             }
                
//             else 
//             {
//                 low = mid + 1;
//             }
                
//         }
//         return ans;        
//     }

//     public static void main(String Args[])
//     {
//         int nums[] = {1,3,5,6}, target = 7;
//         int result = searchInsert(nums, target);
//         System.out.println(result);
//     }
// }



/*********USED OBJECT BECAUSE OF NON-STATIC METHOD */
public class binInser {
    public int searchInsert(int arr[], int N)
    {
        int n = arr.length;
        int low = 0, high = n-1;
        int ans = n;

        while(high >=low)
        {
            int mid = low + (high -low) / 2;

            if(arr[mid] >= N)
            {
                ans = mid;
                high = mid - 1;
            }   
             
            else
            low = mid + 1;
        }
        return ans;
        }


    public static void main(String Args[])
    {
        int arr[] = {1, 2, 2, 2, 5}, target = 2;
        binInser obj = new binInser();
        int index = obj.searchInsert(arr,target);

        System.out.println("The index is: " + index);
    }
    
}

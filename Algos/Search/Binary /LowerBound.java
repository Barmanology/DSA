public class LowerBound {

    public int LB(int arr[], int N)
    {
        int low = 0, high = (arr.length - 1), ans = arr.length;
        while(high >= low)
        {
            int mid = low + (high - low)/2 ;
            if (arr[mid] >= N)   
                {
                    ans = mid;
                    high = mid - 1;
                }
            else
            {
                low = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String Args[])
    {
        int[] arr = {3, 5, 8, 8, 8, 8, 8, 15, 19};  // Sorted array
        int x = 8;                      // Target value

        LowerBound obj = new LowerBound();
        int lb = obj.LB(arr, x);
        System.out.println(lb);
    }
    
}

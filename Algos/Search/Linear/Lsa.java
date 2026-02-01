public class Lsa
{
    public static int searchl(int lsr[], int N, int x)
    {
        for (int i = 0; i < N; i++)
        {
            if (lsr[i] == x)
            return i + 1;
        }


        return -1;
    }


    public static void main(String Args[])
    {
        int arr[] = {1,2,3,4,5,6,7,8,23,324,23,56};
        int target = 324;

        int hit = searchl(arr, arr.length, target);

        if (hit == -1)
        System.out.println("No hit");
        else
        System.out.println("Hit at " + hit + "th place");


    }
}

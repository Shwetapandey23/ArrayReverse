public class ArrayReverse {
    static int [] reverseArray(int[]arr)
    {
        int n=arr.length;
        int[] ans =new int[n];
        int j=0;
        //traverse orignal array in reverese direction
        for(int i=n-1;i>=0;i--)
        {
             ans[j++]=arr[i];
        }
        //int i=n-1,j=0;
       // while(i>=0)
        //{
            //ans[j++]=arr[i--];
       // }
        return ans;

    }
    static void printArray(int[]arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println( );
    }
    
    public static void main(String[]args)
    {
        int  arr[] ={1,2,5,7,3,9,6};
        int ans[] = reverseArray(arr);
        printArray(ans);

    }
    
}

//{ Driver Code Starts
import java.util.*;

class GFG
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			int n = sc.nextInt();
			int arr[] = new int[n]; 
			for(int i=0;i<n;i++)
			{
				arr[i] = sc.nextInt();
			}
		
			Solution obj = new Solution();
			obj.selectionSort(arr, n);
			
			for(int i=0;i<n;i++)
		    	System.out.print(arr[i]+" ");
		    System.out.println();
			t--;
		}
		
	}
}

// } Driver Code Ends


class Solution
{
	int  select(int arr[], int i)
	{
        return 0;
	}
	
	void selectionSort(int arr[], int n)
	{
	    for(int l=0; l<arr.length-1; l++){
        for(int r=l+1; r<arr.length; r++){
        if(arr[l]>arr[r]){
            int backup=arr[l];
            arr[l]=arr[r];
            arr[r]=backup;
        }
    }
}

	}
}
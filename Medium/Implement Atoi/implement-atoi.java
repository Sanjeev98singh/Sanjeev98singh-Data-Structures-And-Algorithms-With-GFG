//{ Driver Code Starts
//Initial template for JAVA

import java.util.Scanner;

class aToi
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		while(t>0)
		{
			String str = sc.nextLine();
			
			Solution obj = new Solution();
			int num = obj.atoi(str);
			
			System.out.println(num);
		t--;
		}
	}
}
// } Driver Code Ends
class Solution
{
    int atoi(String s) {
    if(s==null || s.isEmpty()) {
            return -1;
      }
        int sign=1;
        int index=0;
        while(index<s.length() && Character.isWhitespace(s.charAt(index))) {
            index++;
        }
        if(index<s.length() && (s.charAt(index)=='+' || s.charAt(index)=='-')) {
            sign=(s.charAt(index) == '-') ? -1 : 1;
            index++;
        }
        long result=0;
        while (index<s.length() && Character.isDigit(s.charAt(index))) {
            result=result*10+Character.getNumericValue(s.charAt(index));
            if (result*sign>Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            } else if (result*sign<Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
            index++;
        }
        while(index<s.length()) {
            if (!Character.isDigit(s.charAt(index))) {
                return -1;
            }
            index++;
        }
        return (int)(result*sign);
    }
}

//{ Driver Code Starts
import java.util.Scanner;
import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.LinkedList;

class GreyCode
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			int n = sc.nextInt();
			Solution g = new Solution();
			ArrayList <String> res = g.generateCode(n);
			for (String i : res) 
			    System.out.print (i + " ");
			System.out.println();
		t--;
		}
	}
}
// } Driver Code Ends
class Solution
{
    ArrayList <String> generateCode(int n)
    {
	 if(n == 1) {
           ArrayList <String> base = new ArrayList<>();
           base.add("0");
           base.add("1");
           return base;
       }
       ArrayList <String> a = generateCode(n - 1);
       ArrayList <String> A = new ArrayList<>();
       for(int i = 0; i < a.size(); i++) {
           A.add("0" + a.get(i));
       }
       
       for(int i = a.size() - 1; i >= 0; i--) {
           A.add("1" + a.get(i));
       }
       
       return A;
    }
}

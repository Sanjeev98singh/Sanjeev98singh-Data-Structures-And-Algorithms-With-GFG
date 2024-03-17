//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String S = read.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.longestPalin(S));
        }
    }
}

// } Driver Code Ends
class Solution{
    static String longestPalin(String S){
         if (S==null || S.length()==0) {
            return "";
        }
        String longest ="";
        for (int i=0;i<S.length();i++) {
            String palindrome1=expandAroundCenter(S,i,i);
            if (palindrome1.length()>longest.length()){
                longest=palindrome1;
            }
            String palindrome2=expandAroundCenter(S,i,i+1);
            if (palindrome2.length()>longest.length()){
                longest=palindrome2;
            }
        }
        return longest;
    }
   public static String expandAroundCenter(String s, int left, int right) {
        while (left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)) {
            left--;
            right++;
        }
        return s.substring(left+1,right);
    }
}
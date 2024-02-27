//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S=read.readLine();
            Solution ob = new Solution();
            System.out.println(ob.ExtractNumber(S));
        }
    }
}
// } Driver Code Ends
class Solution{
    long ExtractNumber(String S){
        long max = -1;
        int n = S.length();
        for(int i=0;i<n;i++){
            if(Character.isDigit(S.charAt(i)) && S.charAt(i)!='9'){
                if(i!=0){
                    if(Character.isDigit(S.charAt(i-1))){
                        continue;
                    }
                }
                long temp = 0;
                boolean flag = true;
                while(i<n && S.charAt(i)!=' '){
                    if(S.charAt(i)=='9'){
                        flag = false;
                        break;
                    }
                    temp = temp*10 + S.charAt(i)-'0';
                    i++;
                }
                if(flag){
                    max = Math.max(temp,max);
                }
            }
        }
        return max;
    }
}
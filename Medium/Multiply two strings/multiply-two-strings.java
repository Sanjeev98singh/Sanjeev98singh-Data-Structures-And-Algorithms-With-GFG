//{ Driver Code Starts
//Initial Template for Java


import java.util.*;
import java.math.*;

class Multiply{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String a=sc.next();
            String b=sc.next();
            Solution g=new Solution();
            System.out.println(g.multiplyStrings(a,b));
        }
    }
}
// } Driver Code Ends
class Solution
{
    public String multiplyStrings(String s1,String s2)
    {
      int sign = (s1.charAt(0) == '-' ^ s2.charAt(0) == '-') ? -1 : 1;
        s1 = s1.charAt(0) == '-' ? s1.substring(1) : s1;
        s2 = s2.charAt(0) == '-' ? s2.substring(1) : s2;

        int n1 = s1.length(), n2 = s2.length();
        int[] result = new int[n1 + n2]; 
        for (int i = n1 - 1; i >= 0; i--) {
            for (int j = n2 - 1; j >= 0; j--) {
                int mul = (s1.charAt(i) - '0') * (s2.charAt(j) - '0');
                int sum = mul + result[i + j + 1]; 
                
                result[i + j + 1] = sum % 10;
                result[i + j] += sum / 10; 
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int num : result) {
            if (!(sb.length() == 0 && num == 0)) { 
                sb.append(num);
            }
        }
        
        if (sb.length() == 0) return "0";
        if (sign == -1) sb.insert(0, '-');
        
        return sb.toString();
    }
}
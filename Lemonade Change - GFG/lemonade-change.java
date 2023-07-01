//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            Solution obj = new Solution();
            boolean ans = obj.lemonadeChange(n, a);
            System.out.println(ans ? "True" : "False");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    static boolean lemonadeChange(int N, int bills[]) {
        int five = 0, ten = 0;
        for(int i = 0; i < N; i++)
        {
            switch(bills[i]/5)
            {
                case 1: five++;
                        break;
                        
                case 2: if(five < 1)
                            return false;
                        five--;
                        ten++;
                        break;
                        
                case 4: if(ten > 0)
                        {
                            ten--;
                            if(five > 0)
                            {
                                five--;
                                break;
                            }
                            else
                            {
                                return false;
                            }
                        }
                        else if(five < 3)
                            return false;
                        five -= 3;
                        break;
            }
        }
        return true;
    }
}

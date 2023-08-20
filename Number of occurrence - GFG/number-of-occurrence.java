//{ Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int x = Integer.parseInt(inputLine[1]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().count(arr, n, x);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java



class Solution {
    int left = 0, right = 0;
    int count(int[] arr, int n, int x) {
        int left = leftFrequency(arr, 0, n-1, x);
        int right = rightFrequency(arr, 0, n-1, x);
        return right - left ;
    }
    int leftFrequency(int[] arr, int st, int end, int x)
    {
        if(st > end)
            return st-1;
            
        int mid = (st + end) / 2;
        if(arr[mid] == x)
        {
            return leftFrequency(arr, st, mid-1, x);
        }
        else if(arr[mid] > x){
            return leftFrequency(arr, st, mid-1, x);
        }
        else{
            return leftFrequency(arr, mid+1, end, x);
        }
        
    }
    int rightFrequency(int[] arr, int st, int end, int x)
    {
        if(st > end)
            return st-1;
            
        int mid = (st + end) / 2;
        if(arr[mid] == x)
        {
            return rightFrequency(arr, mid+1, end, x);
        }
        else if(arr[mid] > x){
            return rightFrequency(arr, st, mid-1, x);
        }
        else{
            return rightFrequency(arr, mid+1, end, x);
        }
        
    }
}
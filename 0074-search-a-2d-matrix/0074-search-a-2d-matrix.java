class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i = 1; i < matrix.length; i++)
        {
            if(matrix[i][0] > target)
            {
                return search(matrix[i-1], target);
            }
        }
        return search(matrix[matrix.length - 1], target);
    }
    public boolean search(int arr[], int t)
    {
        for(int i = 0; i < arr.length; i++)
        {
            
            if(arr[i] == t)
                return true;
        }
        return false;
    }
}
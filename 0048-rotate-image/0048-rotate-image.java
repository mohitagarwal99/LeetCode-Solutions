class Solution {
    public void rotate(int[][] matrix) {
        transpose(matrix);
        reverse(matrix);
    }
    public void transpose(int[][] matrix)
    {
        for(int i = 0; i < matrix.length; i++)
        {
            for(int j = i+1; j < matrix[0].length; j++)
            {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        
    }
    public void reverse(int a[][]) 
    { 
        for(int j = 0; j < a.length; j++)
        {
            for (int i = 0; i < a[j].length / 2; i++) { 
                int t = a[j][i]; 
                a[j][i] = a[j][a[j].length - i - 1]; 
                a[j][a[j].length - i - 1] = t; 
            } 
        }
    } 
}
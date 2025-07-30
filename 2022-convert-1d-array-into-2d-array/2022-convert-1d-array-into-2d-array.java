class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
       int l=  original.length;
       if(m*n==l)
       {
      int [][] result=new int [m][n];
      int k=0;
      for(int i=0;i<m;i++)
      {
        for(int j=0;j<n;j++)
        {
            result[i][j]=original[k++];
        }
      }
      return result;  
    }
    return new int [0][0];
    }
}
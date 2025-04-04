class Solution {
    public void setZeroes(int[][] matrix) {
        int m=matrix.length;// row length
        int n=matrix[0].length;//column length
        int row_tracker[]=new int [m];
        int col_tracker[]=new int [n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(matrix[i][j]==0)
                {
                    row_tracker[i]=1;
                    col_tracker[j]=1;
                }
            }
        }
        for(int g=0;g<m;g++)
        {
            if(row_tracker[g]==1)
            {
                for(int s=0;s<n;s++)
                {
                    matrix[g][s]=0;
                }
            }
        }
        for(int h=0;h<n;h++)
        {
           if(col_tracker[h]==1)
           {
            for(int f=0;f<m;f++)
            {
                matrix[f][h]=0;
            }
           }
        }
    }
}
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int low=0;
        int high=matrix.length-1;
        int row=-1;
        while(low<=high)
        {
          int  mid=low+(high-low)/2;
            if(matrix[mid][0]<=target && target <= matrix[mid][matrix[mid].length-1])
            {row=mid;break;}
            else if(matrix[mid][0]>target)
            {
                high=mid-1;
            }
            else {low=mid+1;}
        }
        if(row==-1)
        {
            return false;
        }
       
        int start=0;
        int end =matrix[row].length-1;
        while(start<=end)
        {
        int middle=start+(end-start)/2;
         if(matrix[row][middle]==target)
            return true;
         else if(matrix[row][middle]>target)
            end=middle-1;
         else
            start=middle+1;
        }
        return false;
        
    }
}
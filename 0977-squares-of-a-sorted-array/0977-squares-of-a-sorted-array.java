class Solution {
    public int[] sortedSquares(int[] nums) {
       for(int i=0;i<nums.length;i++)
       {
        int n=Math.abs(nums[i]);
        n=n*n;
        nums[i]=n;
       } 
       for(int i=0;i<nums.length;i++)
       {
        int k=nums[i];
        int j=i-1;
        while(j>=0&&k<nums[j])
        {
            nums[j+1]=nums[j];
            --j;
        }
        nums[j+1]=k;
       }
       return nums;
    }
}
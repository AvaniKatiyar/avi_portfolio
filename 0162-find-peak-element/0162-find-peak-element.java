class Solution {
    public int findPeakElement(int[] nums) {
        int l=0,r=nums.length-1;
        int mid=-1;
        if(nums.length==1)
        return 0;
        if(nums.length==2)
        { int res=(nums[0]>nums[1])?nums[0]:nums[1];
          return res;
        }
        while(l<r)
        {
            mid=l+(r-l)/2;
            if((nums[mid-1]<nums[mid])&&(nums[mid]>nums[mid+1]))
            {
                return mid;
            }
            else if(nums[mid]>nums[mid-1])
            {
               l=mid+1;
            }
            else 
            {
                r=mid-1;
            }
        }
        return l;
    }
}
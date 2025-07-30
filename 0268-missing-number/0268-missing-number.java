class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int l=nums.length;
        if(nums[0]!=0){return 0;}
        
        for(int i=0;i<l-1;i++){
            if(nums[i+1]!=nums[i]+1)
            {
               return nums[i]+1;
            }
        }
        if(l-1==nums[l-1])
        {
          return l;  
        }
        return 0;
    }
}
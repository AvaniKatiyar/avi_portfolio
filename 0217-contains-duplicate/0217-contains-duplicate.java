class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        int l=nums.length;
        if(l<=1)
        {
            return true ;
        }
        for(int i=0;i<l-1;i++)
        {
            if(nums[i]==nums[i+1])
            {return true;}
        }
        if(nums[l-2]==nums[l-1])
        {
            return true;
        }
        return false;
    }
}
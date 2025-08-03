class Solution {
    public void moveZeroes(int[] nums) {
        int counter =0;
        for(int num:nums)
        {
            if(num!=0)
            {
                nums[counter++]=num;
            }
        }
        while (counter <nums.length)
        {
            nums[counter++]=0;
        }
    }
}
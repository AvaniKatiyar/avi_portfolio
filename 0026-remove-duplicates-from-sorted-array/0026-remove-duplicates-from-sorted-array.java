class Solution {
    public int removeDuplicates(int[] nums) {
        int i=1;
        for(int j=1;j<nums.length;j++)
        {
            if(nums[j-1]!=nums[j])
            {
                nums[i]=nums[j];
                i++;
            }
        }   
        return i;
        // if(nums.length==0) return -1;
        // int res=1;// unique value
        // int i=0; // slow pointer
        // int j=i+1;// fast pointer
        // while(j < nums.length)
        // {
        //     if(nums[i] != nums[j])
        //     {
        //         i++;
        //         nums[i]=nums[j];
        //         res++;

        //     }
        //     j++;

        // }
        // return res;
    }
}
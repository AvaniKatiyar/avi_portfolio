class Solution {
    public int removeElement(int[] nums, int val) {
      // ONE POINTER 
    //   int index=0;
    //   for(int i=0; i<nums.length; i++ )
    //   {
    //     if(nums[i] != val)
    //     {
    //         nums[index]=nums[i];
    //         index++;
    //     }
    //   }
    //   return index;
      
       // TWO POINTER 
        int i=0;
        int j=nums.length-1;
        while(i<=j)
        {
        
          if( nums[i] == val )
          {
            //swap 
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
                    
            j--;
          }
          else
          i++;
        }
        return j+1;
    }
}
class Solution {
    public int[] twoSum(int[] nums, int target) {
   //===brute force=== 
    //     int l=nums.length;
       
    //    for (int i=0;i<l-1;i++)
    //    {
    //       for (int j=i+1;j<l;j++)
    //       {
    //         if(nums[i]+nums[j]==target)
    //         {
    //            return new int []{i,j};
    //         } 
    //       }
    //    }  
    //   return new int []{};
    // }
    // ===using hashmap===
     HashMap <Integer,Integer> map=new HashMap<>();
     for(int i=0;i<nums.length;i++)
     {
        int compliment =target-nums[i];
        if(map.containsKey(compliment))
        {
            return new int[]{map.get(compliment),i} ;
        }
        map.put(nums[i],i);
        //store index as value and nums[i] as key because index is to be returned 
     }
     return new int[] {};
     }



  
}
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
      HashMap <Integer,Integer> map=new HashMap<>();
      for(int i=0;i<nums.length;i++)
      {
        //duplicate found 
        if(map.containsKey(nums[i]))
        {
          int j=map.get(nums[i]);
          if(Math.abs(i-j)<=k)
           return true;
        }
        //duplicate not found
        map.put(nums[i],i);
      } 
      return false ; 
    }
}
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
      ArrayList<Integer> set = new ArrayList <>();
      for(int i=0;i<nums.length;i++)
      {
        set.add(nums[i]);
      } 
      ArrayList<Integer> result =new ArrayList<>();
      for(int j=1;j<=nums.length;j++)
      {
        if(!set.contains(j))
            result.add(j);
      }
      return result;
    }
}
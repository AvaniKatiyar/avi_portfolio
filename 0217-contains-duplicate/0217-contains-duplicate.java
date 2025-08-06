class Solution {
    public boolean containsDuplicate(int[] nums) {
        //use set because dealing with duplicates
        Set<Integer> check=new HashSet<>();
        for(int num:nums)
        {
            if(check.contains(num))
            return true;
            check.add(num);
        }
        return false ;
    }
}
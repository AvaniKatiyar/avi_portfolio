class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
       HashSet <Integer> ele1=new HashSet <>();
       HashSet <Integer> intersection=new HashSet<>(); 
       for(int num:nums1)
       ele1.add(num);
       for(int i=0;i<nums2.length;i++)
       {
          if(ele1.contains(nums2[i])){
            intersection.add(nums2[i]);}
       }
       int []result=new int [intersection.size()];
       int i=0;
       for(int num: intersection)
       {
        result[i++]=num;
       }
       return result;
    }
}
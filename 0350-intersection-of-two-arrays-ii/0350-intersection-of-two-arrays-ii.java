class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        //sort the elements 
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i=0,j=0;
        ArrayList<Integer> intersection =new ArrayList<>();
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]==nums2[j]){
                intersection.add(nums1[i]);
               i++;
               j++;
            }
            else if(nums1[i]<nums2[j]){
                i++;
            }
            else{
                j++;
            }
        }
        int[] result = new int[intersection.size()];
        for (int x = 0; x < intersection.size(); x++) {
            result[x] = intersection.get(x);
        }
        return result;
    }
}
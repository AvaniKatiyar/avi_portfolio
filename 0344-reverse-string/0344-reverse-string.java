class Solution {
    public void reverseString(char[] s) {
       int i=0,l=s.length-1;
       char z;
       while(i<=l)
       {
         z=s[i];
         s[i]=s[l];
         s[l]=z;
         i++;
         l--;
       } 
    }
}
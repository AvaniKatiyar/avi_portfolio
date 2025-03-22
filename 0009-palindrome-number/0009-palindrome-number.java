class Solution {
    public boolean isPalindrome(int x) {
        String s=Integer.toString(x);
        String r="";int l=s.length();
        for(int i=l-1;i>=0;i--)
        {
            r=r+s.charAt(i);
        }
        System.out.print(r+" "+s);
        if(s.equals(r))
        {
            return true;
        }
        else {return false;}
    }
}
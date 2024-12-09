class Solution {
    public boolean isAnagram(String s, String t) {
        s=s.toLowerCase();
        t=t.toLowerCase();
        int arr[] =new int[26];
        for(int i=0;i<s.length();i++)
        {
            int index=s.charAt(i)-'a';
            arr[index]++;
        }
        for(int i=0;i<t.length();i++)
        {
            int index=t.charAt(i)-'a';
            arr[index]--;
        } 
        int c=0;
        for(int i=0;i<26;i++)
        {
            if(arr[i]!=0)
            {
                c++;
           }
        }
        if(c==0)
        {
            return true;
        }
        else return false ;
        
    }
}
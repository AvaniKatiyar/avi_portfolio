class Solution {
    public boolean isHappy(int n) {
        int nn=n;
        Set<Integer> seen=new HashSet<>();
        while(!seen.contains(n))
        {
           seen.add(n); 
           n=nextnumber(n);
           if(n==1 )
           {
            return true;
           }
        }
        return false ;
    }
    public int nextnumber(int n)
    {  
       int res=0;
       while(n!=0)
       {
        int d=n%10;
        res=res+(int)Math.pow(d,2);
        n=n/10;
       }
      return res;

    }
}
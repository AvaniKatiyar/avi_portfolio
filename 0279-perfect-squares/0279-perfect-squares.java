class Solution {
     int ans=Integer.MAX_VALUE;
     Map<Integer,Integer> hm=new HashMap<>();
    public int numSquares(int n) {
        return solve (n);
    }
    private int solve (int n)
    {
        if(n==0)
         return 0;
        int i=1;
        if(hm.containsKey(n)) return hm.get(n);
        while((i*i)<=n)
        {
            ans=Math.min(ans,1+solve(n-(i*i)));
            i++;
            hm.put(n,ans);
        }
        return ans;
    }
}
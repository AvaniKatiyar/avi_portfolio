class Solution {
    public int arrangeCoins(int n) {
        int c=0;
        while(c<n)
        {
            c=c+1;
            n=n-c;
        }
        return c;
    }
}
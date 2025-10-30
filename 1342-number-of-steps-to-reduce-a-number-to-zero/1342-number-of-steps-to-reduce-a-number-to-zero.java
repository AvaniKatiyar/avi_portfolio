class Solution {
    public int numberOfSteps(int num) {
        return reduce(num,0);
    }
    private static int reduce (int num, int count)
    {
        if(num==0)
        return count;
        if(num%2==0)
        {
            return reduce(num/2,count+1);
        }
        else
        {
            return reduce(num-1,count+1);
        }
    }
}
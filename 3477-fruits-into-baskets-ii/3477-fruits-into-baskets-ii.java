class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
     int n=fruits.length;
     int op=n;
     for(int i=0;i<n;i++)
     {
        for(int j=0;j<n;j++)
        {
            if(fruits[i]!=0 && baskets[j]!=0)
            {
                if(fruits[i]<=baskets[j])
                {
                  fruits[i]=0;
                  baskets[j]=0;
                  op--;
                  break;
                }
            }

        } 
     }
     return op;   
    }
}
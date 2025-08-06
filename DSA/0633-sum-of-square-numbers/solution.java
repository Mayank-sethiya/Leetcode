class Solution {
    public boolean judgeSquareSum(int c) {
       int i=0;
      
       int sqroot=(int)Math.sqrt(c);
        int j=sqroot;
        long sum=0;
       while(i<=j)
       {
        sum=1L*i*i+1L*j*j;
        if(sum==c)
        {
            return true;
        }
        else if(sum>c)
        {
            j--;
        }
        else
        {
            i++;
        }
        
       }

     return false;   
    }
}

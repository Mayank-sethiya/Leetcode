class Solution {
    public boolean isHappy(int n) {
        int originalNum=n,square=0,lastDig=0;
        while(n!=1 && n!=4)
        {
            int sum=0;
            while(n>0)
            {
              lastDig=n%10;
              square=lastDig*lastDig;
              sum+=square;
              n/=10;
            }
            n=sum;
            
        }
    if(n==1)
    {    
    return true;
    }
    else
    {
        return false;
    }
    }
}

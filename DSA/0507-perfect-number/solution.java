class Solution {
    public boolean checkPerfectNumber(int num) {
        int perfectNum=0,originalNum=num;
        for(int i=1;i<num;i++)
        {
            if(num%i==0)
            {
             perfectNum+=i;
            }
        }
        if(perfectNum==originalNum)
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }
}

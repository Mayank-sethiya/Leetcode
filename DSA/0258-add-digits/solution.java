class Solution {
    public int addDigits(int num) {
        int sum=0,lastDig=0;
       while(num>=10)
       {
        while(num>0)
        {
            lastDig=num%10;
            sum+=lastDig;
            num/=10;

        }
        num=sum;
        sum=0;
       }
       return num;
 }
}

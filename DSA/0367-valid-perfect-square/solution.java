class Solution {
    public boolean isPerfectSquare(int num) {
       int start=1,end=num;
       int mid=1;
       while(start<=end)
       {
        mid=start+(end-start)/2;
       if((long)mid*mid==num)
       {
        return true;
       }
       if((long)mid*mid<num)
       {
        start=mid+1;
       }
       else
       {
        end=mid-1;
       }
       }


     return false;  
    }
}

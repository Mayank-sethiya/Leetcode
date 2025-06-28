class Solution {
    public int missingNumber(int[] nums) {
        int originalSum=0;
        int sum=0;
        int n=nums.length;
        sum=n*(n+1)/2;
        int index=n-1;
        while(index>=0)
        {
         originalSum+=nums[index];
         index--;
        }
        return sum-originalSum;

    }
}

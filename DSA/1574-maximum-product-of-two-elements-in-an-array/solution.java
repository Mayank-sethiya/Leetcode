class Solution {
    public int maxProduct(int[] nums) {
        int firstMax=0;
        int secondMax=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=firstMax){
                secondMax=firstMax;
                firstMax=nums[i];
            }else if(nums[i]>=secondMax && nums[i]<=firstMax){  //[6,5,4,3,2,1] then the secondMax will be zero but thats wrong
                secondMax=nums[i];
            }
        }
        return (firstMax-1)*(secondMax-1);
    }
}

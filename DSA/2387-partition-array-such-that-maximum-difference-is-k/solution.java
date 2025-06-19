class Solution {
    public int partitionArray(int[] nums, int k) {
       Arrays.sort(nums);
       int ans=0;
       int first=nums[0];
       for(int i=1;i<nums.length;i++)
       {
        if(nums[i]-first>k)
        {
            first=nums[i];
            ans++;
        }
       }
       return ans+1;



        
    }
}

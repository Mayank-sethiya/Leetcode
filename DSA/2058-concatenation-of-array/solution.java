class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans=new int[(nums.length)+(nums.length)];
        int count=0;
        while(count<ans.length)
        {
        for(int i=0;i<nums.length;i++)
        {
            ans[count]=nums[i];
            count++;
        }
        
        }
        return ans;
    }
}

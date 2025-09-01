class Solution {
    public int removeDuplicates(int[] nums) {
        LinkedHashSet<Integer> hs=new LinkedHashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            hs.add(nums[i]);
        }
        int j=0;
        for(int num:hs)
        {
            nums[j]=num;
            j++;
        }
        return hs.size();
        
    }
}

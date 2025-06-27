class Solution {
    public void sortColors(int[] nums) {
        int count1=0;
        int count2=nums.length-1;
        int arr[]=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
            arr[count1]=nums[i];
            count1++;
            }
            if(nums[i]==2)
            {
            arr[count2]=nums[i];
            count2--;
            }

        }
        for(int i=count1;i<=count2;i++)
        {
            arr[i]=1;
        }
        int index=0;
       for (int num:arr)
       {
          nums[index]=arr[index];
          index++;
       }
    }
}

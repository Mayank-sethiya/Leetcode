class Solution {
    public int[] sortArrayByParity(int[] nums) {
         int left=nums.length-1;
         int[] arr=new int[nums.length];
         int right=0;

        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%2==0)
            {
                arr[right]=nums[i];
                right++;
            }
            else
            {
                arr[left]=nums[i];
                left--;
            }
        }
        return arr;
       
        }
        
        
    }


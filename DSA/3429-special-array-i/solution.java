class Solution {
    public boolean isArraySpecial(int[] nums) {
        int size = nums.length;
        if (size == 1) {
            return true;
        }

        int i = 0;
        while (i < size - 1) {
            if (nums[i] % 2 == 0 && nums[i + 1] % 2 != 0) {
                i++;
            } else if (nums[i] % 2 != 0 && nums[i + 1] % 2 == 0) {
                i++;
            } else {
                return false;
            }
        }
        return true;
    }
}


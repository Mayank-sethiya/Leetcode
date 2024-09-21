class Solution:
    def singleNumber(self, nums):
        result = 0
        
        # Iterate over every bit position (32-bit integers)
        for i in range(32):
            bit_sum = 0
            for num in nums:
                # Check if the i-th bit is set in num
                bit_sum += (num >> i) & 1
            
            # If bit_sum is not a multiple of 3, set the i-th bit in the result
            if bit_sum % 3 != 0:
                # Handle negative numbers for the 31st bit (sign bit)
                if i == 31:
                    result -= (1 << i)
                else:
                    result |= (1 << i)
        
        return result



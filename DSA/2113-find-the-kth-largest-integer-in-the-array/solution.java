import java.math.BigInteger;
class Solution {
    public String kthLargestNumber(String[] nums, int k) {
        PriorityQueue<BigInteger> pq = new PriorityQueue<>();
        for(String num : nums){
            BigInteger value = new BigInteger(num);
            pq.add(value);
        }
        for(int i =0; i<(nums.length-k); i++){
            pq.remove();
        }

        return pq.peek().toString();
        
    }
}

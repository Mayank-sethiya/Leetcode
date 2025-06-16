class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalGas = 0, totalCost = 0, currTank = 0, start = 0;
        
        for (int i = 0; i < gas.length; i++) {
            totalGas += gas[i];
            totalCost += cost[i];
            currTank += gas[i] - cost[i];
            
            // If current tank is negative, reset the start point and current tank
            if (currTank < 0) {
                start = i + 1;
                currTank = 0;
            }
        }
        
        // If total gas is less than total cost, return -1; otherwise, return the start index
        return totalGas >= totalCost ? start : -1;
    }
}


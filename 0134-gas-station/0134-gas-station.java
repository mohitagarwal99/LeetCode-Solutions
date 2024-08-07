class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        int totalGas = 0, totalCost = 0, tank = 0, start = 0;

        for (int i = 0; i < n; i++) {
            totalGas += gas[i];
            totalCost += cost[i];
            tank += gas[i] - cost[i];

            if (tank < 0) {
                start = i + 1;  // Reset starting point to the next station
                tank = 0;       // Reset tank as we start from a new station
            }
        }

        if (totalGas < totalCost) {
            return -1; // If total gas is less than total cost, it's not possible to complete the circuit
        }

        return start;
    }
}
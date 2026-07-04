class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalGas = 0;
        int totalCost = 0;
        int tank = 0;
        int start = 0;

        for (int i = 0; i < gas.length; i++) {
            totalGas += gas[i];
            totalCost += cost[i];
            tank += gas[i] - cost[i];

            // If tank drops below 0, the current starting station 'start' is invalid.
            // Pick the next station (i + 1) as the new temporary starting point.
            if (tank < 0) {
                start = i + 1;
                tank = 0; // Reset tank for the new starting station
            }
        }

        // If overall total gas is less than total cost, it's impossible to complete the circuit.
        if (totalGas < totalCost) {
            return -1;
        }

        return start;
    }
}

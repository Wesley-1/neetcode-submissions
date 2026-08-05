class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
       final int totalGas = Arrays.stream(gas).sum();
       final int totalCost = Arrays.stream(cost).sum();

       if (totalGas < totalCost) return -1;

       int total = 0;
       int result = 0;

       for (int i = 0; i < gas.length; i++) {
        total += (gas[i] - cost[i]);
        if (total < 0) {
            total = 0;
            result = i + 1;
        }
       }

       return result;
    }
}

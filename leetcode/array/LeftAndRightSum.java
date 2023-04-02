package leetcode.array;

public class LeftAndRightSum {

    public int[] leftAndRightSum(int[] nums ) {

        int[] leftSum = new int[nums.length];
        int[] rightSum = new int[nums.length];
        int[] totalSum = new int[nums.length];
        leftSum[0] = 0; // leftSum[0]
        rightSum[nums.length - 1] = 0; // rightSum[? , ?, ?, 0]
        for(int i = 1; i <= nums.length - 1; i++) { // leftSum[0, 10]       -> leftSum[0, 10, 14] -> [0, 10, 14, 22]
            leftSum[i] = leftSum[i - 1] + nums[i - 1]; // -> [1 = 0 + 10 ] -> [2 = 10 + 4] ->      [3 = 14 + 8]
        }
        for(int i = rightSum.length - 2; i >= 0; i--) { // [? , ?, ?, 0] -> [? , ?, 3, 0] ->[?, 11,3, 0] ->
            rightSum[i] = rightSum[i + 1] + nums[i + 1]; // -> [2 = 0 + 3] -> [1 = 3 + 8] ->  [0 = 11 + 4] -> [15, 11,3, 0]
        }

        for( int i = 0; i < totalSum.length; i++ ) {
            totalSum[i] = rightSum[i] > leftSum[i] ? rightSum[i] - leftSum[i] : leftSum[i] - rightSum[i];
        }

        return totalSum;
    }
}

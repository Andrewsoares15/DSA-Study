package leetcode.array;

public class NumberOfGoodPairs {
    public int numIdenticalPairs(int[] nums) {
        int goodPairsValue = 0;
        for (int i = 0; i < nums.length; i ++) {
            int indexToCompare = i;
            for(int j = i + 1; j < nums.length; j++) {
                if(nums[indexToCompare] == nums[j]) {
                    goodPairsValue++;
                }
            }
        }
        return goodPairsValue;
    }
}

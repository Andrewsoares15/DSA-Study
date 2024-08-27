package leetcode.array;

public class TwoSum {
    public static void main(String[] args) {
        int input[] = {3,3};
        int[] sum = twoSum(input, 6);
        for (int num: sum) {
            System.out.println(num);
        }
    }
    static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            int controlIndex = i + 1;
            while (controlIndex < nums.length){
                if (nums[i] + nums[controlIndex] == target)
                    return new int[] {i, controlIndex};
                controlIndex++;
            }
        }
        return new int[] {};
    }
}

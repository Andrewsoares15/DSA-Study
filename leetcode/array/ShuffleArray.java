package leetcode.array;

public class ShuffleArray {

    public int[] shuggleArray(int[] nums, int n) {
        int[] myArr = new int[nums.length];
        int countY = n; // 3
        int countX = 0; // 0
        int countPosition = 0;
        while (countPosition < nums.length) { // [0 < 6] -> [2 < 6] -> [4 < 6]
            myArr[countPosition] = nums[countX]; // [0 = 0] -> [2 = 1] -> [4 = 2]
            countPosition++; // 1 // 3 -> 5
            myArr[countPosition] = nums[countY]; // [1 = 3] -> [3 = 4] -> [5 = 5]
            countPosition++; // 2 // 4 // 6
            countY++; // 4 // 5
            countX++; // 1 // 2
            // [2, 3] -> [5, 4] -> [1, 7]
        }
        return myArr;

    }
    static int[] ShuggleArray(int[] nums, int n) {
        int[] myArr = new int[nums.length];
        for (int i = 0; i < n; i++) {
            myArr[2 * i] = nums[i];
            myArr[2 * i + 1] = nums[n + i];
        }
        return myArr;
    }
}

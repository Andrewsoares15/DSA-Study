package leetcode.array;

public class ArrayPermutation {

    public static void main(String[] args) {
        int[] permutation = permutation(new int[]{5,0,1,2,3,4});
        for (int num: permutation) {
            System.out.println(num);
        }
    }

    static int[] permutation(int [] nums){
        int[] newArray = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            newArray[i] = nums[nums[i]];
        }
        return newArray;

    }
}

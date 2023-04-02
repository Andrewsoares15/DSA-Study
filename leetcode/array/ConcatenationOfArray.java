package leetcode.array;

public class ConcatenationOfArray {

    public static void main(String[] args) {
        int[] concatenation = concatenation(new int[]{1,3,2,1});
        for (int num: concatenation) {
            System.out.println(num);
        }
    }


    static int[] concatenation(int[] nums) {
        int[] newArray = new int[nums.length * 2];
        int count = 0;
        while (count < newArray.length){
            for (int i = 0; i < nums.length;i++){
                newArray[count] = nums[i];
                count++;
            }
        }
        return newArray;
    }
}

package leetcode.array;

public class PeakIndexInMountainArray {
    public int peakIndexInMountainArray(int[] nums) {

        var right = nums.length - 1; // 4
        var left = 0;

        while(left + 1 < right) { // 1 < 4 -> 3 -> 2 < 3
            int mid = left + (right - left) / 2; // 2
            if(nums[mid] >= nums[mid - 1] && nums[mid] >= nums[mid + 1]){
                return mid;
            }
            if((nums[mid] > nums[mid - 1])){
                left = mid + 1;
            }else{
                right = mid;
            }
        }

        if(nums[left] >  nums[left - 1] && nums[left] > nums[left + 1]) return left;
        return right;
    }
}

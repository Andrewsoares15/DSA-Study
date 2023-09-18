package leetcode.array;

public class FindFirstAndLast {
    public int[] searchRange(int[] nums, int target) {
        if(nums.length <= 1){
            return new int[]{target - 1,target - 1};
        }

        var right = nums.length - 1;
        var left = 0;
        while(left + 1 < right) {
            var mid = left + (right - left) / 2; // 1
            if(nums[mid] == target) {
                var x = mid;
                var y = mid;
                while(x >= left && nums[x] == target) {
                    x--;
                }
                while(y <= right && nums[y]==target) {
                    y++;
                }
                return new int[]{++x, --y};
            }
            if(nums[mid] < target){
                left = mid;
            }else{
                right = mid - 1;
            }
        }
        if(nums[left] == target){
            if(nums[left + 1] == target) {
                return new int[]{left, left+1};
            }
            return new int[]{left, left};
        }else if(nums[right] == target) {
            if(nums[right - 1] == target) {
                return new int[]{right-1, right};
            }
            return new int[]{right, right};
        }
        return new int[]{-1,-1};
    }
}

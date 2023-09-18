package leetcode.array;

public class SearchMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        var lengthOfMatrix = matrix.length;
        var currentArray = 0;
        var right = matrix[0].length - 1;
        var left = 0;
        //target 16
        while(currentArray <= lengthOfMatrix - 1){// 0 -> 1
            while(left < right){

                int mid = left + (right - left) / 2; // 1 -> 2 ->

                if(matrix[currentArray][mid] == target){
                    return true;
                }
                else if(matrix[currentArray][mid] < target){
                    left = mid + 1;
                }
                else{
                    right = mid - 1;
                }
            }

            if(matrix[currentArray][left] ==  target) return true;

            currentArray++;
            left= 0;
            right = matrix[0].length - 1;
        }

        // if(matrix[currentArray][left] ==  target) return true;
        // if(matrix[currentArray][right] ==  target) return true;
        return false;

    }
}

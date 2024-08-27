package study;


import java.util.*;
import java.util.stream.IntStream;

public class TestHash {

    public static void main(String[] args) {

    }

    private static Integer binarySearch(int[] nums, int target) {
        var right = 10000;
        var left = 0;

        while(left < right) { // temos uma variação aqui, ou usamos o sinal de igual aqui. Nesse caso conseguimos garantir que sempre teremos acesso ao mid + 1

            int mid = left + (right - left) / 2;

            if(nums[mid] == target){
                return mid;
            }
            if(nums[mid] < target){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        if(nums[left] ==  target) return left; // ou fazemos a verificação aqui, quando os valores se equivalem

        return -1;
    }

}
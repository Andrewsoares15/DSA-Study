package leetcode.hashmap;

import java.util.*;
import java.util.stream.Collectors;

public class TwoSum {
    public static void main(String[] args) {
//        int[] ints = smallerNumbersThanCurrent(new int[]{8,1,2,2,3});
//        for (int num: ints) {
//            System.out.println(num);
//        }
        containsduplicate(new int[]{1,2,3,4});
    }

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numToIndex = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(numToIndex.containsKey(target - nums[i])) { // 9 - 2 -> 9 - 7
                return new int[] {numToIndex.get(target - nums[i]), i};
            }
            numToIndex.put(nums[i], i);
        }

        return new int[] {};
    }


    static int teste(String jewels, String stones) {
        int num = 0;
        HashSet<Character> jewelshash = new HashSet<>();
        for (char letter: jewels.toCharArray()) {
            jewelshash.add(letter);
        }
        for (char letter: stones.toCharArray()) {
            if (jewelshash.contains(letter)) {
                num++;
            }
        }
       while (jewelshash.iterator().hasNext()) {

       }

        return num;
    }

    static int other(String jewels, String stones) {
        int num = 0;
        for (char letter: stones.toCharArray()) {
           if (jewels.contains(String.valueOf(letter))){
                num++;
           }
        }

        return num;
    }
    static int[] smallerNumbersThanCurrent(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] copy = nums.clone();

        Arrays.sort(copy);

        for (int i = 0; i < nums.length; i++) {
            map.putIfAbsent(copy[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            copy[i] = map.get(nums[i]);
        }

        return copy;
    }

    static boolean containsduplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap();
        for(int num: nums) {
            if (map.containsKey(num)){
                return true;
            }
            map.put(num, num);
        }
        return false;
    }
}

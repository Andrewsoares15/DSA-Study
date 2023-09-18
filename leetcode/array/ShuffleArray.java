package leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;

public class ShuffleArray {
    static int index = 0;
    public static void main(String[] args) {
//        ArrayList<String> strings = phoneNumber("");
//        System.out.println(strings.toString());
        int[] ints = {4, 4, 2, 1, 2};
        int num = getNum(ints);
        System.out.println(num);

    }

    private static int getNum(int[] ints) {
        Arrays.sort(ints);
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] != ints[i + 1]){
                return ints[i];
            }
        }
        return ints[ints.length - 1];
    }

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
//
//    static ArrayList<String> phoneNumber(String digits) {
//        ArrayList<String> output = new ArrayList<>();
//        if (digits == null || digits.length() == 0) {
//            return output;
//        }
//        String[] phone = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
//        recursion(output, "", digits, 0, phone);
//
//        return output;
//    }
//
//    static void recursion(ArrayList output, String combination
//            , String digits, int index, String[]phone) {
//        if (index == digits.length())
//            output.add(combination);
//        else {
//            String letters = phone[digits.charAt(index) - '0'];
//            for (int i = 0; i <letters.length(); i++) {
//                recursion(output, combination + letters.charAt(i), digits, index + 1, phone);
//            }
//        }
//    }
////[output=0]



    static ArrayList<String> phoneNumber(String digits) {
        String[] strings = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        ArrayList<String> output = new ArrayList<>();
        if (digits.length() == 0) {
            return output;
        }
        int index = 0;
        recursion(strings,index,"", output, digits);

        return output;
    }

    private static void recursion(String[] phoneNumbers, int index,String combination, ArrayList<String> output, String digits) {
        if (index == digits.length()) {
            output.add(combination);
        }
        else {
            String letters = phoneNumbers[digits.charAt(index) - '0'];
            for (int i = 0; i < letters.length(); i++) {
                recursion(phoneNumbers, index + 1, combination + letters.charAt(i),output, digits);
            }
        }

    }

//    static String[] phoneNumber(String digits) {
//        Hashtable<String, String[]> hashtable = new Hashtable();
//        hashtable.put("2", new String[]{"a", "b", "c"});
//        hashtable.put("3",  new String[]{"d", "e", "f"});
////        hashtable.put("4", "ghi");
////        hashtable.put("5", "jkl");
////        hashtable.put("5", "mno");
////        hashtable.put("7", "pqrs");
////        hashtable.put("8", "tuv");
////        hashtable.put("9", "wxyz");
//        String[] output =  new String[100];
//        char[] digitsArray = digits.toCharArray();
//        for (int i = 0; i < digitsArray.length;  i++) {
//            String[] strings = hashtable.get(digitsArray[i]); // a,b,c
//            while (hashtable.values())
//        }
//        return output;
//    }
}

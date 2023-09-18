package leetcode.array;

import java.util.HashMap;
import java.util.stream.Stream;

public class IsAnagram {
    public static void main(String[] args) {
        System.out.println(isAnagramTwo("acac", "acaac"));
    }

    public static boolean isAnagramTwo(String s, String t) {
        String[] names = new String[10];
        int length = names.length;
        if(s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Integer> hashMaps = new HashMap<>();
        HashMap<Character, Integer> hashMapt = new HashMap<>();

        //counting the frequency of each letter
        for (int i = 0; i < s.length(); i++){
            hashMaps.merge(s.charAt(i), 1, Integer::sum);
            hashMapt.merge(t.charAt(i), 1, Integer::sum);
        }

        //comparing the frequency of each letter
//        for (var values : hashMaps.entrySet()){
//            if (values.getValue() != hashMapt.get(values.getKey())){
//                return false;
//            }
//        }

        return hashMaps.equals(hashMapt);
    }

    public static boolean isAnagramThree(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Integer> hashMaps = new HashMap<>();

        //counting the frequency of each letter
        for (int i = 0; i < s.length(); i++){
            hashMaps.merge(s.charAt(i), 1, (a, b) -> a++);
            hashMaps.merge(t.charAt(i), 1, (a, b) -> a - b);

        }
        //comparing the frequency of each letter
        for (var values : hashMaps.entrySet()) {
            if (values.getValue() != 0){
                return false;
            }
        }

        return true;
    }



    public static boolean isAnagram(String s, String t) {
        boolean value = false;
        if(s.length() != t.length()) {
            return false;
        }
        for(char letterA : s.toCharArray()) {
            value = false;
            if(t.contains(String.valueOf(letterA))){
                value = true;
                t = t.replaceFirst(String.valueOf(letterA), "");
            }
            if(!value) {
                break;
            }
        }
        return value;
    }
}

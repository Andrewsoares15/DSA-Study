package leetcode.array;

public class IsAnagram {
    public static void main(String[] args) {
        isAnagram("acac", "accc");
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

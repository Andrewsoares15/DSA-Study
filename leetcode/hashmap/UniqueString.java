package leetcode.hashmap;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class UniqueString {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> hashMap = new LinkedHashMap<>();
        for(int i = 0; i < s.length(); i++) {
            hashMap.merge(s.charAt(i), 1, Integer::sum);
        }

        for(var values : hashMap.entrySet()){
            if(values.getValue() == 1){
                return s.indexOf(values.getKey());
            }
        }
        return -1;
    }
}

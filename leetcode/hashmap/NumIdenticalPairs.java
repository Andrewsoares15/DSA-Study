package leetcode.hashmap;

import java.util.HashMap;
import java.util.Map;

public class NumIdenticalPairs {
    static int numIdenticalPairs(int[] guestList) {
        Map<Integer, Integer> hm = new HashMap<>();

        int ans = 0;

        for(int friend:guestList)
        {
            int friendCount = hm.getOrDefault(friend,0);
            ans+=friendCount;
            hm.put(friend,friendCount+1);
        }


        return ans;
    }
}

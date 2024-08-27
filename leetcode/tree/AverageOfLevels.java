package leetcode.tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AverageOfLevels {
    HashMap<Integer, Pair<Long, Long>> levelToSumCount = new HashMap<>();
    public List<Double> averageOfLevels(TreeNode root) {

        List<Double> result = new ArrayList<>();;
        if(root == null){
            return List.of();
        }
        averageOfLevelsHelper(root, 0);
        for(var kv : levelToSumCount.entrySet()){
            var value = kv.getValue();
            result.add(Double.valueOf(value.getFirst()) / Double.valueOf(value.getSecond()));
        }
        return result;
    }

    void averageOfLevelsHelper(TreeNode root, int level) {
        if(root == null) return;
        if(levelToSumCount.get(level) == null){
            levelToSumCount.put(level, new Pair<Long, Long>((long) root.val,(long) 1));

        }else{
            levelToSumCount.put(level, new Pair<>(levelToSumCount.get(level).getFirst() + root.val, levelToSumCount.get(level).getSecond() + 1));
        }
        averageOfLevelsHelper(root.left, level + 1);
        averageOfLevelsHelper(root.right, level + 1);
    }

    class Pair<K, V> {
        private final K key;
        private final V value;

        public Pair(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getFirst() {
            return key;
        }

        public V getSecond() {
            return value;
        }
    }
}

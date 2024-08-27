package study.grafo;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Levels {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(2147483647, new TreeNode(2147483647), new TreeNode(2147483647));
        System.out.println(new Levels().averageOfLevels(root));
    }
    HashMap<Integer, Pair<Long, Long>> levelToSumCount = new HashMap<>();
    public List<Double> averageOfLevels(TreeNode root) {

        List<Double> result = new ArrayList<>();
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
        Pair<Long, Long> pair = levelToSumCount.get(level);
        if(pair == null){
            pair = new Pair<Long, Long>((long) root.val,(long) 1);
        }else{
            pair = new Pair<>(pair.getFirst() + root.val, pair.getSecond() + 1);

        }
        levelToSumCount.put(level, pair);
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


   class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

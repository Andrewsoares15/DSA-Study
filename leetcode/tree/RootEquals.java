package leetcode.tree;

public class RootEquals {

    public boolean checkTree(TreeNode root) {
        if(root == null){
            return false;
        }

        var left = root.left;
        var right = root.right;
        if((left.val + right.val) ==  root.val){
            return true;
        }
        return false;
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
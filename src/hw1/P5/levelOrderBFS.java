package hw1.P5;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) {
        this.val = val;
    }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
public class levelOrderBFS {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) { return res;}
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.offer(root);
        while (!q.isEmpty()) {
            int sz = q.size();
            List<Integer> tmp = new ArrayList<>();
            for (int i = 0; i < sz; i++) {
                TreeNode cur = q.poll();
                tmp.add(cur.val);
                if (cur.left!=null) {
                    q.offer(cur.left);
                }
                if (cur.right!=null){
                    q.offer(cur.right);
                }
            }
            res.add(tmp);
        }
        return res;
    }
}

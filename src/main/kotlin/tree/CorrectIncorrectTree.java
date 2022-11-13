package tree;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class CorrectIncorrectTree {
    /*
    public TreeNode correctBinaryTree(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        Set<Int> v = new HashSet<>();
        TreeNode invalid = null;
        while (!q.isEmpty()) {
            var sz = q.size();
            for (int i = 0; i< sz; i++) {
                var t = q.poll();
                v.add(t.val);
                if (t.left != null) q.add(t.left);
                if (t.right != null && v.contains(t.val)) {
                    invalid = t;
                    break;
                } else if (t.right != null) {
                    q.add(t);
                }
            }
            if (invalid != null) break;
        }
        q.clearAll();
        q.add(root);
        while (!q.isEmpty()) {
            var sz = q.size();
            var flg = -1;
            for (int i=0; i< sz; i++) {
                var t = q.poll();
                if (t.left == invalid) t.left = null;
                else if (t.right == invalid) t.right = null;
                if (t.left != null) q.add(t.left);
                if (t.right != null) q.add(t.right);
            }
        }
        return root;
    }
     */
    public TreeNodeJ correctBinaryTree(TreeNodeJ root) {

        Queue<TreeNodeJ> q = new LinkedList<>();
        q.add(root);
        Set<Integer> v = new HashSet<>();
        TreeNodeJ invalid = null;
        while (!q.isEmpty()) {
            var sz = q.size();
            for (int i = 0; i< sz; i++) {
                var t = q.poll();
                v.add(t.val);
                if (t.left != null) {
                    q.add(t.left);
                    v.add(t.left.val);
                }
                if (t.right != null && v.contains(t.right.val)) {
                    invalid = t;
                    break;
                } else if (t.right != null) {
                    q.add(t.right);
                    v.add(t.right.val);
                }
            }
            if (invalid != null) break;
        }
        q.clear();
        q.add(root);
        while (!q.isEmpty()) {
            var sz = q.size();
            var flg = -1;
            for (int i=0; i< sz; i++) {
                var t = q.poll();
                if (t.left == invalid) t.left = null;
                else if (t.right == invalid) t.right = null;
                if (t.left != null) q.add(t.left);
                if (t.right != null) q.add(t.right);
            }
        }
        return root;
    }
}

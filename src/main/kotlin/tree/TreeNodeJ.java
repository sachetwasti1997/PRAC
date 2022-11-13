package tree;

public class TreeNodeJ {
    int val;
    TreeNodeJ left;
    TreeNodeJ right;
    TreeNodeJ() {}
    TreeNodeJ(int val) { this.val = val; }
    TreeNodeJ(int val, TreeNodeJ left, TreeNodeJ right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

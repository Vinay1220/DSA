import java.util.ArrayList;
import java.util.List;

import javax.swing.tree.TreeNode;

public class Binary_Tree_Inorder_Traversal94 {
    public static void main(String[] args) {
        
    }
    List<Integer> arr = new ArrayList<>();
     public List<Integer> inorderTraversal(TreeNode root) {
        
        if (root!=null) {
            inorderTraversal(root.left);
             arr.add(root.val);
            inorderTraversal(root.right);
        }
        return arr;
    }
}

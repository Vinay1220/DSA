import java.util.*;
public class Binary_Tree_Preorder_Traversal144 {
    
}

// recursion 
 
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> arr = new ArrayList<>();
        if (root!=null) {
            arr.add(root.val);
            preorderTraversal(root.left);
            preorderTraversal(root.right);
        }
        return arr;
    }
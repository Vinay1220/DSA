public class Binary_Tree_Preorder_Traversal144 {
    
}

// recursion 
 List<Integer> arr = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        if (root!=null) {
            arr.add(root.val);
            preorderTraversal(root.left);
            preorderTraversal(root.right);
        }
        return arr;
    }
// import java.util.*;
// public class Binary_Tree_Preorder_Traversal144 {
//     public static void main(String[] args) {
        
//     }


// // recursion 
//     List<Integer> arr = new ArrayList<>();
//     public List<Integer> preorderTraversal(TreeNode root) {
//         if (root!=null) {
//             arr.add(root.val);
//             preorderTraversal(root.left);
//             preorderTraversal(root.right);
//         }
//         return arr;
//     }
// }

// Itrative

// public List<Integer> inorderTraversal(TreeNode root) {
//     List<Integer> arr = new ArrayList<>();
//     Stack<TreeNode> st = new Stack<>();
//     TreeNode temp = root;
//     while(temp!=null || !st.isEmpty()){
//         if(temp != null){
//             st.push(temp);
//             temp=temp.left;
//         }
//         else{
//             temp =st.pop();
//             arr.add(temp.val);
//             temp=temp.right;
//         }
//     }
//     return arr;
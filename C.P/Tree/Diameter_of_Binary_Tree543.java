 package Tree;

// import javax.swing.tree.TreeNode;



      
 

class Diameter_of_Binary_Tree543 {
    public static void main(String[] args) {
        
    }
   
    int diameter;
    public static int diameterOfBinaryTree(TreeNode root){
        diameter = 0;
        depth(root);
        return diameter;
    }

    public static int depth(TreeNode node){
        if(node == null) return 0;
        int L = depth(node.left);
        int R = depth(node.right);
        diameter = Math.max(diameter, L+R);
        return Math.max(L, R)+1;
    }
    
}
package week_32_Algorithm;

public class LowestCommonAncestor {

public class TreeNode{

    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }
}

// RECURSIVE SOLUTION I: TC O(log(n)), space complexity O(log(n))
 public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q){

    if (p.val < root.val && q.val < root.val){
        return  lowestCommonAncestor( root.left, p, q);
    }else if (p.val > root.val && q.val > root.val){
        return lowestCommonAncestor(root.right, p,q);
    }

 return root;

 }
    // RECURSIVE SOLUTION II: TC O(log(n)), space complexity O(log(n))


    static TreeNode recursiveSolution(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null)
            return null;

        // both p and q are less than root
        // their ancestor must be in root.left
        if (p.val < root.val && q.val < root.val)
            return recursiveSolution(root.left, p, q);

        // both p and q are greater than root
        // their ancestor must be in root.right
        if (p.val > root.val && q.val > root.val)
            return recursiveSolution(root.right, p, q);

        return root;
    }


// ITERATIVE SOLUTION I: TC O(log(n)), space complexity O(1)

    static TreeNode iterativeSolution(TreeNode root, TreeNode p, TreeNode q) {
        int small = Math.min(p.val, q.val);
        int large = Math.max(p.val, q.val);
        while (root != null) {
            if (root.val > large) // p, q belong to the left subtree
                root = root.left;
            else if (root.val < small) // p, q belong to the right subtree
                root = root.right;
            else // Now, small <= root.val <= large -> This root is the LCA between p and q
                return root; // root == small || root == large
        }
        return null;
    }




}


//Given a binary search tree (BST), find the lowest common ancestor (LCA) node of two given nodes in the BST.
//Input: root = [6,2,8,0,4,7,9,null,null,3,5], p = 2, q = 8
//Output: 6
//Explanation: The LCA of nodes 2 and 8 is 6.
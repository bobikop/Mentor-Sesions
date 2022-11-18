package week_30_Algorithm.Task4;

public class SumOfNodeDepths1 {

    // my binary tree node class
    static class TreeNode
    {
        int data; // data or value
        TreeNode left, right;
    }

    // Function that allocates a new
// node with data and NULL to its
// left and right pointers
    static TreeNode newNode(int data)
    {
        TreeNode Node = new TreeNode();
        Node.data = data;
        Node.left = Node.right = null;
        return (Node);
    }

    // Function to find the sum of depths of
// all nodes in subtree of the current node
    static int sumofdepth(TreeNode root, int d)
    {

        // If NULL node then return 0
        if (root == null)
            return 0;

        // Recursively find the sum of
        // depths of all nodes in the
        // left and right subtree
        return d + sumofdepth(root.left, d + 1) +
                sumofdepth(root.right, d + 1);
    }



    public static void main(String[] args)
    {

        // Given Tree
        TreeNode root = newNode(1);
        root.left = newNode(2);
        root.right = newNode(3);
        root.left.left = newNode(4);
        root.left.right = newNode(5);
        root.right.left = newNode(6);
        root.right.right = newNode(7);
        root.left.left.left = newNode(8);
        root.left.left.right = newNode(9);


        System.out.println(sumofdepth(root,0));
    }


}


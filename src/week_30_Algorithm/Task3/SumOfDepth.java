package week_30_Algorithm.Task3;

public class SumOfDepth {

    public static class TNode {
        public int value;
        public TNode leftChild;
        public TNode rightChild;


    }

    // Function that allocates a new node with data and NULL to its left and right pointers
    static TNode newNode(int value){
        TNode node = new TNode();
        node.value = value;
        node.leftChild = node.rightChild = null;

        return node;
    }

    static int sumOfDepth(TNode root, int d){
        // If NULL node then return 0
        if (root == null)
            return 0;

        // // Recursively find the sum of depths of all nodes in the left and right subtree

        return d + sumOfDepth(root.leftChild, d+1) + sumOfDepth(root.rightChild, d+1);
    }


    public static void main(String[] args) {

       TNode root = newNode(1);
        root.leftChild = newNode(2);
        root.rightChild = newNode(3);
        root.leftChild.leftChild = newNode(4);
        root.leftChild.rightChild = newNode(5);
        root.rightChild.leftChild = newNode(6);
        root.rightChild.rightChild = newNode(7);
        root.leftChild.leftChild.leftChild = newNode(8);
        root.leftChild.leftChild.rightChild = newNode(9);

        System.out.println(sumOfDepth(root, 0));
    }

}

package week_30_Algorithm.Task2;

public class inOrderTraversal_Recursive {

    public class TreeNode {
        int value;
        TreeNode leftChild;

        TreeNode rightChild;

        public TreeNode(int value) {
            this.value = value;
        }
    }

        TreeNode root;

        void inOrderTraversal(TreeNode root) {
            if (root == null) return; // termination
            inOrderTraversal(root.leftChild);
            System.out.print(root.value + ", ");
            inOrderTraversal(root.rightChild);
        }






    }

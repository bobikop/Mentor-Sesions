package week_31_Algorithm;

public class RangeSumOfBST {


    public class TNode {
        public int value;
        public TNode leftChild;
        public TNode rightChild;

        public TNode(int value) {
            this.value = value;
        }
    }




    public int rangeSumOfBST (TNode root, int low, int high){

        if( root == null) return 0;

        if (root.value > high)
            return rangeSumOfBST(root.leftChild, low, high);
        else if (root.value < low)
            return rangeSumOfBST(root.rightChild, low, high);
        else return root.value + rangeSumOfBST(root.leftChild, low, high) + rangeSumOfBST(root.rightChild, low, high);

    }

}

package week_31_Algorithm;

public class SameTree {

    public class TNode {
        public int value;
        public TNode leftChild;
        public TNode rightChild;

        public TNode(int value) {
            this.value = value;
        }
    }


    public static boolean isSameTree(TNode a, TNode b){


        // in order to check if two trees are same we will need to traverse both trees at same time


        // if both trees are null then true
        if( a == null && b == null)
            return true;

        // if both trees are not empty then compare them
        if(a != null && b != null)
            return (a.value == b.value && isSameTree(a.leftChild ,b.leftChild) && isSameTree(a.rightChild , b.rightChild));

        return false;
    }


}

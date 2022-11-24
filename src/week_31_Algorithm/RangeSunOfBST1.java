package week_31_Algorithm;

public class RangeSunOfBST1 {

    public class TNode {
        public int value;
        public TNode leftChild;
        public TNode rightChild;

        public TNode(int value) {
            this.value = value;
        }
    }

    //we need integer outside
    private static  int answer;

    public static int recursive(TNode root, int low, int high){

        answer = 0;
        dfs(root, low, high);
        return answer;
    }

    public static void dfs(TNode node, int low, int high){

        if (node != null){

            if(low <= node.value && node.value <= high)
                answer += node.value;
            if (node.value > low) // we dont nee dto look left children
                dfs(node.leftChild , low, high);
            if (node.value < high) // we dont need to look right children
                dfs(node.rightChild, low ,high);
        }
    }
}

package week_30_Algorithm.Task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class InOrderTraversal {

    public class TreeNode {
        int value;
        TreeNode leftChild;
        TreeNode rightChild;

        public TreeNode(int value) {
            this.value = value;
        }

        public List<Integer> inorderTraversal(TreeNode root) {
            List<Integer> result = new ArrayList<>();
            Stack<TreeNode> stack = new Stack<>();
            TreeNode curr = root;
            while (curr != null || !stack.isEmpty()) {
                while (curr != null) {
                    stack.push(curr);
                    curr = curr.leftChild;
                }
                curr = stack.pop();
                result.add(curr.value);
                curr = curr.rightChild;
            }
            return result;
        }

    }
}
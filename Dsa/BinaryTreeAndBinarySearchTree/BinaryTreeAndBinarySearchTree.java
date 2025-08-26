package BinaryTreeAndBinarySearchTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinaryTreeAndBinarySearchTree {
    static class TreeNode{
        int val;
        TreeNode left, right;

        public TreeNode(int val) {
            this.val = val;
        }

        @Override
        public String toString() {
            return String.valueOf(this.val);
        }
    }

    // Recursive Preorder Traversal (DFS): Time: O(n) Space: O(n)
    static void preOrder(TreeNode root) {
        if(root == null){
            return;
        }

        System.out.print(root.toString() + " ");

        preOrder(root.left);
        preOrder(root.right);
    }

    // Recursive Inorder Traversal (DFS): Time: O(n) Space: O(n)
    static void inOrder(TreeNode root){
        if(root == null) {
            return;
        }

        inOrder(root.left);
        System.out.print(root.toString() + " ");
        inOrder(root.right);
    }

    // Recursive PostOrder Traversal (DFS): Time: O(n) Space: O(n)
    static void postOrder(TreeNode root){
        if(root == null){
            return;
        }

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.toString() + " ");
    }

    //Iterative DFS (no recursion)
    static void preOrderIterative(TreeNode root){
        Stack<TreeNode> stack = new Stack<>();

        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode node = stack.pop();

            System.out.print(node.toString() + " ");

            if(node.right != null) {
                stack.push(node.right);
            }

            if(node.left != null) {
                stack.push(node.left);
            }
        }
    }

    // Level Order Traversal (BFS): Time O(n)
    static void leverOrder(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            TreeNode node = queue.poll();
            System.out.print(node.toString() + " ");

            if(node.left != null){
                queue.offer(node.left);
            }

            if(node.right != null){
                queue.offer(node.right);
            }
        }
    }

    //DFS Time: O(n), Space: O(n)
    static boolean checkValueIsExist(TreeNode node, int target){
        if(node == null){
            return false;
        }

        if(node.val == target){
            return true;
        }

        return checkValueIsExist(node.left, target) || checkValueIsExist(node.right, target);
    }

    // search binary tree; O(logn)
    static boolean searchBST(TreeNode node, int target){
        if(node == null){
            return false;
        }

        if(node.val == target){
            return true;
        }

        if(node.val < target){
            return searchBST(node.right, target);
        } else {
            return searchBST(node.left, target);
        }

    }


    public static void main(String[] args) {
        // Hardcoded binary tree
        //          1
        //       /    \ 
        //      2     3 
        //    /  \   /
        //   4   5  10
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(5);
        root.left.left = new TreeNode(4);
        root.right.left = new TreeNode(10);

        System.out.print("Preorder: ");
        preOrder(root);

        System.out.print("\nInorder: ");
        inOrder(root);

        System.out.print("\nPostorder: ");
        postOrder(root);

        System.out.print("\nIterative preorder: ");
        preOrderIterative(root);

        System.out.print("\nLevel order: ");
        leverOrder(root);

        System.out.println("\nCheck value is exists: " + String.valueOf(checkValueIsExist(root, 6)));

        // Hardcoded binary tree
        //           5
        //       /     \ 
        //      1       8 
        //    /  \    /  \
        //   -1   3  7   9
        TreeNode rootBST = new TreeNode(5);
        rootBST.left = new TreeNode(1);
        rootBST.right = new TreeNode(8);

        rootBST.left.right = new TreeNode(3);
        rootBST.left.left = new TreeNode(-1);

        rootBST.right.left = new TreeNode(7);
        rootBST.right.right = new TreeNode(9);

        System.out.println("\nCheck value is exists: " + String.valueOf(searchBST(rootBST, 10)));

        System.out.println();
    }

}

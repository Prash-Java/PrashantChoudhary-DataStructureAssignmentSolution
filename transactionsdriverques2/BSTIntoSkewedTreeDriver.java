package com.greatlearning.assignment.dsaprojectthree.transactionsdriverques2;

import com.greatlearning.assignment.dsaprojectthree.transactionsserviceques2.Node;
import com.greatlearning.assignment.dsaprojectthree.transactionsserviceques2.BSTIntoSkewedTree;

//Driver Class
public class BSTIntoSkewedTreeDriver {
    //Instance of Service Class With Reference To Its Object
    public static BSTIntoSkewedTree tree = new BSTIntoSkewedTree();

    public static void main(String[] args) {
        //Level 0 In BST
        Node root = new Node(50);
        //Level 1 In BST
        root.left = new Node(30);
        root.right = new Node(60);
        //Level 2 In BST, All Levels must maintain values in order where A<root<B, A and B are Left & Right Subtrees
        root.left.left = new Node(10);
        root.left.right = new Node(40);
        //Method Calls For Changing BST Into List/Right Skewed Tree And That Will Traverse Inorder
        //This will then print currentNode.data with INORDER Traversal In Ascending Order(Bottom-Top) Approach of DFS
        tree.printTraversals(tree.bstIntoList(root));
    }
}

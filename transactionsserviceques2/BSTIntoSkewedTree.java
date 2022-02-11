package com.greatlearning.assignment.dsaprojectthree.transactionsserviceques2;

public class BSTIntoSkewedTree {
    //Class Node Instance
    public Node previousNode;

    //This would print the Traversals Nodewise
    public void printTraversals(Node parentNode) {
        Node currentNode = parentNode;
        while (currentNode != null) {
            System.out.print(currentNode.data + " ");
            //Right Skewed Tree so we consider Right
            currentNode = currentNode.right;
        }
    }

    //Inorder Traversals To Maintain Ascending Order
    public void InorderTraversals(Node currentNode) {
        // Checkpoint To check current Node and perform Recursion on Inorder Traversals
        if (currentNode == null)
            return;
        //Left SubTree-->Recursive
        InorderTraversals(currentNode.left);
        previousNode.left = null;
        //Adding Current Node Pointer
        previousNode.right = currentNode;
        previousNode = currentNode;
        //Right SubTree-->Recursive
        InorderTraversals(currentNode.right);
    }

    //Converting Given BST Into Sorted Linked List as Right Skewed Tree Is Equivalent To Linked List
    public Node bstIntoList(Node parentNode) {
        //Imaginary node
        Node imaginaryNode = new Node(0);
        //Reference To Previous Node
        previousNode = imaginaryNode;
        //InorderTraversal
        InorderTraversals(parentNode);
        previousNode.left = null;
        previousNode.right = null;
        //because we are going towards Right Skewed Tree
        Node node = imaginaryNode.right;
        return node;
    }
}

package com.greatlearning.assignment.dsaprojectthree.transactionsserviceques2;

//blueprint for Node Of Binary Tree
public class Node {
    //Node Attributes are its Data, its Left And Right Pointers
    public int data;
    public Node left;
    public Node right;

    //Parametrised Constructor For Node
    public Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

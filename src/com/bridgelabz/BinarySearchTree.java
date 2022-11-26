package com.bridgelabz;

     /**
      *UC1.Ability to create a BST by adding 56 and then adding 30 and 70
      * UC2.Check if all are added with using size method in Binary Tree
      * UC3.Ability to search 63 in BSt Implement Search method and recursively search left or right nodes to find 63
      */

class Node {
    int data;
    Node left;
    Node right;
}

public class BinarySearchTree {

    public Node insert(Node root,int value) {
        if (root==null) {
            return createNewNode(value);
        }
        /*
        if value less than root data then it will ptint on left side
        */
        if(root.data > value) {
            root.left = insert(root.left,value);
            /*
            if value is greater than root data then it will print on right side
             */
        } else if (root.data < value ) {
            root.right = insert(root.right,value);
        }
        return root;
    }
    public Node createNewNode(int a) {
        Node bst = new Node();
        bst.data = a;
        bst.left = null;
        bst.right = null;
        return bst;
    }
    public void print(Node root) {
        if (root == null) {
            return;
        }
        print(root.left);
        System.out.println(root.data);
        print(root.right);
    }
    public int size(Node node) {
        /*
         *  if condition is true then node is empty if condition is false then
         * else condition is worked
         */
        if (node == null)
            return 0;
        else
            return(size(node.left) + 1 + size(node.right));
    }

    public boolean nodePresent(Node root, int val) {
        /**
         * if root is empty then return false
         */
        if (root == null) {
            return false;
        }

        Boolean isPresent = false;

        while (root != null) {
            if (val < root.data) {
                root = root.left;
            } else if (val > root.data) {
                root = root.right;
            } else {
                isPresent = true;
                break;
            }
        }
        return isPresent;
    }
}




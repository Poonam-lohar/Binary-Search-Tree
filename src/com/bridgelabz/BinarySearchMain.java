package com.bridgelabz;

public class BinarySearchMain {

    public static void main(String[] args) {

        System.out.println("....Welcome To Binary Serach Tree Program....");

        BinarySearchTree bst = new BinarySearchTree();
        Node root = null;
        root = bst.insert(root, 56);
        root = bst.insert(root, 30);
        root = bst.insert(root, 70);
        bst.print(root);
    }
}

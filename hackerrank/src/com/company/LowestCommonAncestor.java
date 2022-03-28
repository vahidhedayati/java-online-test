package com.company;

public class LowestCommonAncestor {

    public static class Node {
        int data;
        Node left;
        Node right;
        Node(int data) {
            this.data=data;
        }
    }
    public static Node lca(Node root, Node a, Node b) {

        if (a.data > root.data && b.data > root.data) {
            return lca(root.right, a, b);
        }
        if (a.data < root.data && b.data < root.data) {
            return lca(root.left, a, b);
        }
        return root;
    }
    public static Node lca(Node root, int val1, int val2) {

        if (val1 > root.data && val2 > root.data) {
            return lca(root.right, val1, val2);
        }
        if (val1 < root.data && val2 < root.data) {
            return lca(root.left, val1, val2);
        }
        return root;
    }

    public static void main(String[] args) {
        Node rootNode= createBinaryTree();

        System.out.println("Lowest common ancestor for node 5 and 30:");
        Node node5=new Node(5);
        Node node30=new Node(30);
        System.out.println(lca(rootNode,5,30).data);

    }
    public static Node createBinaryTree()
    {

        Node rootNode =new Node(40);
        Node node20=new Node(20);
        Node node10=new Node(10);
        Node node30=new Node(30);
        Node node60=new Node(60);
        Node node50=new Node(50);
        Node node70=new Node(70);
        Node node5=new Node(5);
        Node node45=new Node(45);
        Node node55=new Node(55);

        rootNode.left=node20;
        rootNode.right=node60;

        node20.left=node10;
        node20.right=node30;

        node60.left=node50;
        node60.right=node70;

        node10.left=node5;
        node50.right=node55;
        return rootNode;
    }
}

package com.company;

// Java program to reverse a doubly linked list
import java.util.*;
class LinkedList {

    static Node head;

    static class Node {

        int data;
        Node next, prev;

        Node(int d)
        {
            data = d;
            next = prev = null;
        }
    }

    static Node reverseIt(Node head) {
        if (head==null) return head;
        Node currentNode = head;
        Node newHead = head;
        while(currentNode!=null) {
            Node prev = currentNode.prev;
            //trick last line below
            currentNode.prev = currentNode.next;

            currentNode.next = prev;
            newHead=currentNode;

            currentNode = currentNode.prev;
        }
        return newHead;
    }
    /* Function to reverse a Doubly Linked List using Stacks
     */
    void reverse()
    {
        Stack<Integer> stack = new Stack<>();
        Node temp = head;
        while (temp != null) {
            stack.push(temp.data);
            temp = temp.next;
        }
        // added all the elements sequence wise in the
        // stack
        temp = head;
        while (temp != null) {
            temp.data = stack.pop();
            temp = temp.next;
        }
        // popped all the elements and the added in the
        // linked list,
        // which are in the reversed order.
    }

    /* UTILITY FUNCTIONS */
    /* Function to insert a node at the beginning of the
     * Doubly Linked List */
    void push(int new_data)
    {
        /* allocate node */
        Node new_node = new Node(new_data);

		/* since we are adding at the beginning,
		prev is always NULL */
        new_node.prev = null;

        /* link the old list off the new node */
        new_node.next = head;

        /* change prev of head node to new node */
        if (head != null) {
            head.prev = new_node;
        }

        /* move the head to point to the new node */
        head = new_node;
    }

    /* Function to print nodes in a given doubly linked list
    This function is same as printList() of singly linked
    list */
    void printList(Node node)
    {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    // Driver Code
    public static void main(String[] args)
    {
        LinkedList list = new LinkedList();

		/* Let us create a sorted linked list to test the
		functions Created linked list will be 10->8->4->2
	*/
        list.push(2);
        list.push(4);
        list.push(8);
        list.push(10);

        System.out.println("Original linked list ");
        list.printList(head);

        list.reverse();
        System.out.println("");
        System.out.println("The reversed Linked List is ");
        list.printList(head);
    }
}



package com.company;

import java.util.Stack;

public class DuplicateValues {

    static SinglyLinkedListNode removeDuplicates(SinglyLinkedListNode head) {
        if (head==null) return null;
        SinglyLinkedListNode newHead  = head;
        while (head.next !=null) {
            if (head.data == head.next.data) {
                head.next = head.next.next;
            } else {
                head = head.next;
            }
        }
        return newHead;
    }

    static int findMergNode(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        SinglyLinkedListNode head1Current = head1;
        SinglyLinkedListNode head2Current = head2;
        while (head1Current != head2Current) {
            if (head1Current.next==null) {
                head1Current = head2;
            } else {
                head1Current = head1Current.next;
            }

            if (head2Current.next==null) {
                head2Current=head1;
            } else {
                head2Current = head2Current.next;
            }
        }
        return (int)head1Current.data;
    }
    static SinglyLinkedListNode mergeLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        if (head1==null ) return head2;
        if (head2==null ) return head1;

        SinglyLinkedListNode head3 = null;
        if ((int)head1.data < (int)head2.data) {
            head3 = head1;
            head1=head1.next;
        } else {
            head3 = head2;
            head2 = head2.next;
        }
        SinglyLinkedListNode currentNode = head3;

        while (head1!=null && head2 !=null) {
            if ((int)head1.data < (int)head2.data) {
                currentNode.next = head1;
                head1 = head1.next;
            } else {
                currentNode.next = head2;
                head2 = head2.next;
            }
            currentNode = currentNode.next;
        }

        if (head1 == null) {
            currentNode = head2;
        } else {
            currentNode = head1;
        }

        return head3;
    }

    static boolean compareLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        if (head1==null && head2==null) return true;
        SinglyLinkedListNode first_runner = head1;
        SinglyLinkedListNode second_runner = head2;
        while (first_runner != null && second_runner != null ) {
            if (first_runner.data != second_runner.data) {
                break;
            }

            if (first_runner.next == null && second_runner.next == null) {
                //This is when both lists have made it entirely through the list
                return true;
            }
            first_runner = first_runner.next;
            second_runner = second_runner.next;
        }
        return false;
    }

    static boolean compareListsRecursively(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        if (head1==null && head2==null) return true;
        if (head1 == null && head2!=null) return false;
        if (head1 != null && head2==null) return false;
        if (head1.data != head2.data) return false;
        return compareListsRecursively(head1.next, head2.next);
    }

    /**
     * Cycle Detection
     * @param head
     * @return
     */
    static boolean hasCycle(SinglyLinkedListNode head) {
        if (head==null) return false;
        SinglyLinkedListNode slow = head;
        SinglyLinkedListNode fast = head.next;

        while (fast !=null && fast.next !=null) {
            if (slow==fast) {
                return true;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return false;
    }


    static SinglyLinkedListNode reverse(SinglyLinkedListNode head) {
        if (head==null) return head;

        SinglyLinkedListNode prev = null;
        SinglyLinkedListNode current = head;
        while (current!=null) {
            SinglyLinkedListNode nextNode = current.next;
            current.next = prev;
            prev = current;
            current=nextNode;
        }
        return prev;
    }

    static void reversePrint(SinglyLinkedListNode head) {
        if (head==null) return;
        Stack<SinglyLinkedListNode> stack = new Stack();
        SinglyLinkedListNode current_node = head;

        while (current_node !=null) {
            stack.add(current_node);
            current_node = current_node.next;
        }

        while (!stack.isEmpty()) {
            SinglyLinkedListNode node = stack.pop();
            System.out.println(node.data);
        }
    }

    static int getNode(SinglyLinkedListNode head, int positionFromTail) {
        SinglyLinkedListNode pointerNode = head;
        int counter=0;

        while (head !=null) {
            head = head.next;
            if (counter < positionFromTail) {
                counter++;
            } else {
                pointerNode = pointerNode.next;
            }
        }
        return (int)pointerNode.data;
    }

    static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode head, int data) {
        SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
        if (head==null) return newNode;
        newNode.next =head;
        return newNode;

        /**
         *
         *
         *  SinglyLinkedListNode temp = head;
         *         head = newNode;
         *         head.next = temp;
         *         return head;
         */

    }

    static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
        SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
        if (head==null) {
            head = newNode;
            return head;
        }

        SinglyLinkedListNode currentNode = head;
        while (currentNode.next !=null) {
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
        return head;
    }


    static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode head, int data, int position) {
        SinglyLinkedListNode new_node= new SinglyLinkedListNode(data);
        SinglyLinkedListNode current_node = head;
        int index = 0;
        while (index< position-1) {
            current_node = current_node.next;
            index++;
        }
        new_node.next = current_node.next;
        current_node.next = new_node;

        return head;
    }
    static void preOrder(LowestCommonAncestor.Node head) {
        if (head==null) {
            return;
        }
        System.out.println(head.data+" ");
        preOrder(head.left);
        preOrder(head.right);
        Stack<LowestCommonAncestor.Node> stack = new Stack<>();
        stack.add(head);
        while (!stack.isEmpty()) {
            LowestCommonAncestor.Node currentNode = stack.pop();
            System.out.println(currentNode.data);
            if (currentNode.right!=null) {
                stack.add(currentNode.right);
            }
        }

    }
    static LowestCommonAncestor.Node insert(LowestCommonAncestor.Node head, int data) {
        if (head == null) {
            return new LowestCommonAncestor.Node(data);
        } else {
            LowestCommonAncestor.Node curr;
            if (data < head.data) {
               curr = insert(head.left, data);
            } else {
               curr = insert(head.right, data);
            }
        }
        return head;
    }

    static LinkedList.Node reverse(LinkedList.Node head) {
        if (head==null) return head;
        LinkedList.Node currentNode = head;
        LinkedList.Node newHead = head;
        while(currentNode!=null) {
            LinkedList.Node prev = currentNode.prev;
            //trick last line below
            currentNode.prev = currentNode.next;

            currentNode.next = prev;
            newHead=currentNode;

            currentNode = currentNode.prev;
        }
        return newHead;
    }

    static SinglyLinkedListNode deleteNote(SinglyLinkedListNode head, int position) {
        if (head==null) return head;
        if (position == 0)  return head.next;

        int counter=0;
        SinglyLinkedListNode current_node = head;
        while (counter < position-1) {
            current_node = current_node.next;
            counter++;
        }
        current_node.next = current_node.next.next;
        return head;
    }

    public static void main(String[] args) {

    }

    static void printLinkedList(SinglyLinkedListNode head) {
        if (head==null) return;
        while (head !=null) {
            System.out.println(head.data);
            head = head.next;
        }
    }
}

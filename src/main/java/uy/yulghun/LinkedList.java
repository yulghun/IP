package uy.yulghun;


/**
 * 1. LinkedList can be ordered or un-ordered.
 * 2. LinkedList can store numeric, character or objects.
 * 3. Prepending to LinkedList is constant time O(1)
 * 4. Searching time complexity is O(n)
 * 5. Deleting is constant time
 *
 */


/**
 * LinkedList operates on object and has operations such as:
 * append --> O(n)
 * prepend --> O(1)
 * delete  --> O(1) however finding the node to delete is O(n)
 */
public class LinkedList {
    Node head;

    /**
     *
     * @param data
     */
    public void append(int data) {
        // node not initialized case
        if (head == null) {
            head = new Node(data);
            return;
        }

        Node current = head;
        //
        while (current.next != null) {
            current = current.next;
        }

        current.next = new Node(data);
    }

    public void prepend(int data) {
       if (head == null) {
           head = new Node(data);
       }

       Node newHead = new Node(data);
       newHead.next = head;
       head = newHead;
    }

    public void delete(int data) {
        if (head == null) {
            return;
        }

        if (head.data == data) {
            head = null;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
            if (current.data == data) {
                current.next = current.next.next;
                return;
            }
        }
    }

    public Node findNode(int data) {
        if (head == null) {
            return null;
        }

        if (head.data == data) {
            return head;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
            if (current.data == data) {
                return current;
            }
        }
        return null;
    }
}

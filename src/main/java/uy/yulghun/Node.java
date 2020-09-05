package uy.yulghun;

/**
 * Node class represents a node object ( ❍ ) that has :
 *     ----> next as arrow
 *     (integer)  as data
 */
public class Node {
    Node next;

    public int getData() {
        return data;
    }

    int data;

    public Node(int data) {
        this.data = data;
    }
}
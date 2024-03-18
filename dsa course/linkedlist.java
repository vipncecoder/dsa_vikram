import java.util.*;
class Node {
    int data;
    Node next;
    public Node(int val) {
        this.data = val;
        this.next = null;
    }
}

class MyLinkedList {
    Node head;
    int length;

    public MyLinkedList() {
        head = null;
        length = 0;
    }
    
    public int get(int index) {
        if(index < 0 || index >= this.length)
            return -1;

        Node cur = this.head;

        for(int i = 0; i < index; i++) {
            cur = cur.next;
        }

        return cur.data;
    }
    
    public void addAtHead(int val) {
        Node newHead = new Node(val);
        newHead.next = this.head;

        this.head = newHead;
        this.length += 1;
    }
    
    public void addAtTail(int val) {
        if(this.length == 0) {
            addAtHead(val);
            return;
        }

        // Starting from the head,
        // traverse to the last node
        Node cur = this.head;
        while(cur.next != null) {
            cur = cur.next;
        }

        Node newNode = new Node(val);
        cur.next = newNode;

        this.length += 1;
    }
    
    public void addAtIndex(int index, int val) {
        if(index < 0 || index > this.length)
            return;
        
        if(index == 0) {
            addAtHead(val);
            return;
        }

        // index >= 1 and index <= this.length
        Node cur = this.head;
        for(int i = 0; i < index - 1; ++i)
            cur = cur.next;

        Node newNode =  new Node(val);
        newNode.next = cur.next;
        cur.next = newNode;

        this.length += 1;
    }

    public void deleteAtHead() {
        Node secondNode = this.head.next;
        this.head = secondNode;
        this.length -= 1;
    }
    
    public void deleteAtIndex(int index) {
        if(index < 0 || index >= this.length)
            return;
        
        if(index == 0) {
            deleteAtHead();
            return;
        }

        Node cur = this.head;
        for(int i = 0; i < index - 1; ++i) {
            cur = cur.next;
        }

        cur.next = cur.next.next;
        this.length -= 1;
    }
}

public class linkedlist {
    public static void main(String[] args) {
        


    }
}

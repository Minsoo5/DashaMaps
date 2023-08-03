package com.github.zipcodewilmington.LinkedList;

public class MyLinkedList {

    MyNode head;

    public MyLinkedList(String key) {
        head = new MyNode(key, null);
    }

    public MyNode getHead() {
        return head;
    }

    public void setHead(MyNode head) {
        this.head = head;
    }
}

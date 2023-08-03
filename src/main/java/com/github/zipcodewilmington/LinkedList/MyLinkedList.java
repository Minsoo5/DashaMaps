package com.github.zipcodewilmington.LinkedList;

public class MyLinkedList {

    MyNode head;

    public MyLinkedList(String key) {
        head = new MyNode(key, null);
    }

    public void add(String key, Integer value) {
        MyNode currentNode = head;
        while(currentNode.getNext() != null) {
            currentNode = currentNode.getNext();
        }
        currentNode.setNext(new MyNode(key, value));
    }

    public void add(MyNode node) {
        MyNode currentNode = head;
        while(currentNode.getNext() != null) {
            currentNode = currentNode.getNext();
        }
        currentNode.setNext(node);
    }

    public int size() {
        MyNode currentNode = head;
        int counter = 0;
        while(currentNode.getNext() != null) {
            currentNode = currentNode.getNext();
            counter++;
        }
        return counter;
    }

    public boolean isEmpty() {
        return (head.getNext() == null);
    }

    public MyNode get(String key) {
        MyNode currentNode = head;

        while(currentNode != null) {
            if(currentNode.getPair().getKey() == key) {
                return currentNode;
            }
            currentNode = currentNode.getNext();
        }
        return null;
    }

    public MyNode getHead() {
        return head;
    }

    public void setHead(MyNode head) {
        this.head = head;
    }
}

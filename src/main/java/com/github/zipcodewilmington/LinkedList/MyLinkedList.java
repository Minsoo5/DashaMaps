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

    public Integer remove(String key) {
        MyNode laggingNode = head;
        MyNode currentNode = head.getNext();

        while(currentNode.getNext() != null && !currentNode.getPair().getKey().equals(key)) {
            laggingNode = currentNode;
            currentNode = currentNode.getNext();

        } if (currentNode == null) {
            return null;
        }

        laggingNode.setNext(currentNode.getNext());
        return currentNode.getPair().getValue();
    }


    public MyNode getHead() {
        return head;
    }

    public void setHead(MyNode head) {
        this.head = head;
    }
}

package com.github.zipcodewilmington.LinkedList;

import java.util.Objects;

public class MyNode {

    private MyPair pair;
    private MyNode next;

    public MyNode(String key, Integer value) {
        pair = new MyPair(key, value);
        next = null;
    }

    public MyPair getPair() {
        return pair;
    }


    public MyNode getNext() {
        return next;
    }

    public void setNext(MyNode next) {
        this.next = next;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyNode myNode = (MyNode) o;
        return Objects.equals(pair, myNode.pair) && Objects.equals(next, myNode.next);
    }

}

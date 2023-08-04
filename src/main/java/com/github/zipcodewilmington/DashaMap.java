package com.github.zipcodewilmington;

import com.github.zipcodewilmington.LinkedList.MyLinkedList;

/**
 * @author xtofer
 * @version 1.0.0
 * @date 10/21/19 9:05 AM
 */
public class DashaMap implements HashMapX {

    private MyLinkedList[] dash;

    public DashaMap() {
        dash = new MyLinkedList[26];
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < alphabet.length(); i++) {
            dash[i] = new MyLinkedList("" + alphabet.charAt(i));
        }
    }

    @Override
    public void set(String key, Integer value) {
    }

    @Override
    public Integer delete(String key) {
        return null;
    }

    @Override
    public Integer get(String key) {
        return null;
    }

    @Override
    public boolean isEmpty() {
        for (MyLinkedList l : dash) {
            if (!l.isEmpty()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public long size() {
        long size = 0;
        for (MyLinkedList l : dash) {
                size += l.size();
        }
        return size;
    }

    public MyLinkedList[] getDash() {
        return dash;
    }

    @Override
    public boolean bucketSize(String key) {
        return false;
    }
}

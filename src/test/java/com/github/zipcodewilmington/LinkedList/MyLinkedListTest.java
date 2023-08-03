package com.github.zipcodewilmington.LinkedList;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyLinkedListTest {

    @Test
    void addTest() {
        //Given
        MyLinkedList list = new MyLinkedList("John");
        String expectedKey = "Greg";
        Integer expectedValue = 10;
        MyNode expectedNode = new MyNode(expectedKey, expectedValue);

        //When
        list.add("Greg", 10);
        MyNode actualNode = list.getHead().getNext();

        //Then
        Assert.assertEquals(expectedNode, actualNode);

    }

    @Test
    void sizeTest1() {
        //Given
        MyLinkedList list = new MyLinkedList("John");
        String expectedKey = "Greg";
        Integer expectedValue = 10;
        MyNode expectedNode = new MyNode(expectedKey, expectedValue);
        list.add(expectedKey, expectedValue);

        //When
        int expectedSize = 1;
        int actualSize = list.size();

        //Then
        Assert.assertEquals(expectedSize, actualSize);
    }


    @Test
    void sizeTest2() {
        //Given
        MyLinkedList list = new MyLinkedList("John");

        //When
        int expectedSize = 0;
        int actualSize = list.size();

        //Then
        Assert.assertEquals(expectedSize, actualSize);
    }
    @Test
    void sizeTest3() {
        //Given
        MyLinkedList list = new MyLinkedList("John");
        String expectedKey = "Greg";
        Integer expectedValue = 10;
        MyNode expectedNode = new MyNode(expectedKey, expectedValue);
        list.add(expectedNode);

        //When
        int expectedSize = 1;
        int actualSize = list.size();

        //Then
        Assert.assertEquals(expectedSize, actualSize);
    }

    @Test
    void isEmptyTest1() {
        //Given
        MyLinkedList list = new MyLinkedList("John");

        //When
        boolean expected = true;
        boolean actual = list.isEmpty();

        //Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    void isEmptyTest2() {
        //Given
        MyLinkedList list = new MyLinkedList("John");
        MyNode node1 = new MyNode("Greg", 23);
        list.add(node1);

        //When

        //Then
        Assert.assertFalse(list.isEmpty());

    }

    @Test
    void getTest() {
        //Given
        MyLinkedList list = new MyLinkedList("John");
        MyNode node1 = new MyNode("Greg", 23);
        MyNode node2 = new MyNode("Jason", 44);
        MyNode node3 = new MyNode("Bob", 10);
        MyNode node4 = new MyNode("Kai", 39);
        list.add(node1);
        list.add(node2);
        list.add(node3);
        list.add(node4);

        //When
        MyNode expectedNode = node3;
        MyNode actualNode = list.get("Bob");

        //Then
        Assert.assertEquals(expectedNode, actualNode);

    }
    @Test
    void getHead() {
    }

    @Test
    void setHead() {
    }
}
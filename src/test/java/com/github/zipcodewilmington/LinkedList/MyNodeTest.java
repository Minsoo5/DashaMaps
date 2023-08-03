package com.github.zipcodewilmington.LinkedList;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyNodeTest {


    @Test
    void nodeGetPairTest() {
        //Given
        MyNode myNode = new MyNode("Hi", 20);
        MyNode tester = new MyNode("Hi", 20);

        //When
        MyPair expected = tester.getPair();
        MyPair actual = myNode.getPair();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    void nodeSetPairValueTest() {
        //Given


        //When
        //Then
    }

    @Test
    void nodeGetNextTest() {
        //Given
        //When
        //Then
    }

    @Test
    void nodeSetNextTest() {
        //Given
        MyNode first = new MyNode("Hi", 10);
        MyNode second = new MyNode("Hello", 20);

        //When
        first.setNext(second);
        MyNode expected = second;
        MyNode actual = first.getNext();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    void nodeEqualsTest() {
        //Given
        MyNode node1 = new MyNode("Hello", 10);
        MyNode node2 = new MyNode("Hello", 10);

        //When
        //Then
        Assert.assertEquals(node1, node2);
    }
}
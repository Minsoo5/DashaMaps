package com.github.zipcodewilmington.LinkedList;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyPairTest {

    @Test
    void getKeyTest() {
        //Given
        MyPair pair1 = new MyPair("Hi", 10);

        //When
        String expectedKey = "Hi";

        //Then
        Assert.assertEquals(expectedKey, pair1.getKey());
    }

    @Test
    void setKeyTest() {
        //Given
        MyPair pair1 = new MyPair("Hi", 10);

        //When
        pair1.setKey("Hello");
        String expectedKey = "Hello";

        //Then
        Assert.assertEquals(expectedKey, pair1.getKey());
    }

    @Test
    void getValueTest() {
        //Given
        MyPair pair1 = new MyPair("Hi", 10);

        //When
        Integer expectedInt = 10;

        //Then
        Assert.assertEquals(expectedInt, pair1.getValue());
    }

    @Test
    void setValueTest() {
        //Given
        MyPair pair1 = new MyPair("Hi", 10);

        //When
        pair1.setValue(20);
        Integer expectedInt = 20;

        //Then
        Assert.assertEquals(expectedInt, pair1.getValue());
    }

    @Test
    void testEqualsTest1() {
        //Given
        MyPair pair1 = new MyPair("Hi", 10);
        MyPair pair2 = new MyPair("Hi", 10);

        //When

        //Then
        Assert.assertTrue(pair1.equals(pair2));

    }
    @Test
    void testEqualsTest2() {
        //Given
        MyPair pair1 = new MyPair("Hi", 10);
        MyPair pair2 = new MyPair("Hi", 5);

        //When

        //Then
        Assert.assertFalse(pair1.equals(pair2));

    }


}
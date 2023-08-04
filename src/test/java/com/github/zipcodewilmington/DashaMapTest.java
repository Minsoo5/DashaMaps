package com.github.zipcodewilmington;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;

/**
 * @author xtofer
 * @version 1.0.0
 * @date 10/21/19 9:05 AM
 */
public class DashaMapTest {
    @Test
    void set() {
    }

    @Test
    void delete() {
    }

    @Test
    void get() {
    }

    @Test
    void isEmptyTest() {
        //Given
        DashaMap dm = new DashaMap();

        //Then
        Assert.assertTrue(dm.isEmpty());
    }

    @Test
    void sizeEmptyTest() {
        //Given
        DashaMap dm = new DashaMap();

        //When
        long expected = 0;
        long actual = dm.size();

        //Then
        Assert.assertTrue(expected == actual);
    }
    @Test
    void sizeTest() {
        //Given
        DashaMap dm = new DashaMap();

        //When
        long expected = 1L;
        long actual = dm.size();

        //Then
        Assert.assertTrue(expected == actual);
    }

    @Test
    void bucketSize() {
    }
}

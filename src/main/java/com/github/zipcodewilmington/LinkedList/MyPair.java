package com.github.zipcodewilmington.LinkedList;

import java.util.Objects;

public class MyPair {

    private String key;

    private Integer value;


    MyPair(String key, Integer value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyPair myPair = (MyPair) o;
        return Objects.equals(key, myPair.key) && Objects.equals(value, myPair.value);
    }


    //    @Override
//    public boolean equals(Object obj) {
//        if (obj == null){
//            return false;
//        }
//        return this.key.equals(obj.equals(key)) && this.value.equals(obj.equals(value));
//    }







}

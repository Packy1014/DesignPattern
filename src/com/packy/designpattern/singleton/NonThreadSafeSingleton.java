package com.packy.designpattern.singleton;

public class NonThreadSafeSingleton {
    private static NonThreadSafeSingleton instance;
    public String value;

    private NonThreadSafeSingleton(String value) {
        this.value = value;
    }

    public static NonThreadSafeSingleton getInstance(String value) {
        if (instance == null) {
            instance = new NonThreadSafeSingleton(value);
        }
        return instance;
    }
}

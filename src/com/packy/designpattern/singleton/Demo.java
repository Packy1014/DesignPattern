package com.packy.designpattern.singleton;

public class Demo {
    static class ThreadFoo implements Runnable {
        @Override
        public void run() {
            ThreadSafeSingleton threadSafeSingleton = ThreadSafeSingleton.getInstance("FOO");
            System.out.println(threadSafeSingleton.value);
        }
    }

    static class ThreadBar implements Runnable {
        @Override
        public void run() {
            ThreadSafeSingleton threadSafeSingleton = ThreadSafeSingleton.getInstance("BAR");
            System.out.println(threadSafeSingleton.value);
        }
    }

    public static void main(String[] args) {
        NonThreadSafeSingleton nonThreadSafeSingleton_1 = NonThreadSafeSingleton.getInstance("FOO");
        NonThreadSafeSingleton NonThreadSafeSingleton_2 = NonThreadSafeSingleton.getInstance("BAR");
        System.out.println(nonThreadSafeSingleton_1.value);
        System.out.println(NonThreadSafeSingleton_2.value);

        Thread threadFoo = new Thread(new ThreadFoo());
        Thread threadBar = new Thread(new ThreadBar());
        threadFoo.start();
        threadBar.start();
    }
}

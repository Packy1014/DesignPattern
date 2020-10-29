package com.packy.designpattern.bridge;

// the Remotes act as the abstraction.
public interface Remote {
    void power();

    void volumeDown();

    void volumeUp();

    void channelDown();

    void channelUp();
}

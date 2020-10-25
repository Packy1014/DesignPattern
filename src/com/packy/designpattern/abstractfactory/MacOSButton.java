package com.packy.designpattern.abstractfactory;

public class MacOSButton implements Button {
    @Override
    public void click() {
        System.out.println("MacOSButton click...");
    }
}

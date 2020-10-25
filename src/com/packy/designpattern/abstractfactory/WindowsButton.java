package com.packy.designpattern.abstractfactory;

public class WindowsButton implements Button{
    @Override
    public void click() {
        System.out.println("WindowsButton click...");
    }
}

package com.packy.designpattern.abstractfactory;

public class WindowsCheckBox implements CheckBox {
    @Override
    public void click() {
        System.out.println("WindowsCheckBox click...");
    }
}

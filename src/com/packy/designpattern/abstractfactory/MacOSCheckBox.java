package com.packy.designpattern.abstractfactory;

public class MacOSCheckBox implements CheckBox{
    @Override
    public void click() {
        System.out.println("MacOSCheckBox click...");
    }
}

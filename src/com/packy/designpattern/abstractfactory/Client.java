package com.packy.designpattern.abstractfactory;

public class Client {
    public static void main(String[] args) {
        GUIFactory guiFactory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            guiFactory = new MacOSFactory();
        } else {
            guiFactory = new WindowsFactory();
        }
        guiFactory.createButton().click();
        guiFactory.createCheckBox().click();
    }
}

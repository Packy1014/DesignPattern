package com.packy.designpattern.prototype;

public class Circle extends Shape {
    public int radius;

    public Circle() {

    }

    public Circle(Circle target) {
        super(target);
        if (target != null) {
            this.radius = target.radius;
        }
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Circle) || !super.equals(object)) {
            return false;
        }
        Circle circle = (Circle) object;
        return circle.radius == this.radius;
    }

    @Override
    public Shape clone() {
        return new Circle(this);
    }
}
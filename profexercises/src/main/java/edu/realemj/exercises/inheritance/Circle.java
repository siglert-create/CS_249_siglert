package edu.realemj.exercises.inheritance;

import edu.realemj.exercises.math.Matrix;

public class Circle extends Shape {
    private double radius = 1.0;

    public Circle() {
        // super();
    }

    public Circle(double radius) {
        // super();
        setRadius(radius);
    }

    public Circle(double radius, Matrix pos) {
        this(radius, pos, false);
    }

    public Circle(double radius, Matrix pos, boolean filled) {
        super(pos, filled);
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if(radius >= 0.0) {
            this.radius = radius;
        }
    }

}

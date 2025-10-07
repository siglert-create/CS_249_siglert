package edu.realemj.exercises.objects;

import edu.realemj.exercises.math.Matrix;

public class Circle {
    private double radius = 1.0;
    private Matrix pos = Matrix.make2DPoint(0,0);

    public double getRadius() {
        return radius;
    }

    public Matrix getPos() {
        return new Matrix(pos);
    }
}

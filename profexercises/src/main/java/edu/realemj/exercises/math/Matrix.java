package edu.realemj.exercises.math;

public class Matrix {
    private double [][] m;

    public Matrix(int rowCnt, int colCnt) {
        m = new double[rowCnt][colCnt];
    }

    public int getRowCnt() {
        return m.length;
    }

    public int getColCnt() {
        return m[0].length;
    }

    public boolean isInBounds(int row, int col) {
        return (row < getRowCnt() &&
                col < getColCnt() &&
                row >= 0 &&
                col >= 0);
    }

    public double get(int row, int col) {
        if(isInBounds(row,col)) {
            return m[row][col];
        }
        else {
            System.err.println("WARNING: Out of bounds!");
            return 0;
        }
    }

    public void set(int row, int col, double val) {
        if(isInBounds(row,col)) {
            m[row][col] = val;
        }
        else {
            System.err.println("WARNING: Out of bounds!");
        }
    }
}

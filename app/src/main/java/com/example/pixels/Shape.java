package com.example.pixels;

public abstract class Shape {
    protected int x;
    protected int y;
    protected String color = "Green";

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

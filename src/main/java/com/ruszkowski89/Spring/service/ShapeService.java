package com.ruszkowski89.Spring.service;

import com.ruszkowski89.Spring.aspect.Loggable;
import com.ruszkowski89.Spring.model.Circle;
import com.ruszkowski89.Spring.model.Triangle;

public class ShapeService {
    private Circle circle;
    private Triangle triangle;

    @Loggable
    public Circle getCircle() {
        System.out.println("method execution");
        return circle;
    }

    public void setCircle(Circle circle) {
        this.circle = circle;
    }

    public Triangle getTriangle() {
        return triangle;
    }

    public void setTriangle(Triangle triangle) {
        this.triangle = triangle;
    }
}

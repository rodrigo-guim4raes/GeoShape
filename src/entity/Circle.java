package entity;

import enumerations.Color;

public class Circle extends Shape {
    private Double ray;

    public Circle() {
        super();
    }

    public Circle(Color color, Double ray) {
        super(color);
        this.ray = ray;
    }

    public Double getRay() {
        return ray;
    }

    public void setRay(Double ray) {
        this.ray = ray;
    }

    @Override
    public double area(){
        return Math.PI * ray * ray;
    }
}

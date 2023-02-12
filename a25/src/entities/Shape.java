package entities;

import entities.enuns.Color;

public abstract class Shape {
    
    protected Color color;

    public Shape(Color color) {
        this.color = color;
    }

    public Shape() {
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }


    public abstract Double area();

}

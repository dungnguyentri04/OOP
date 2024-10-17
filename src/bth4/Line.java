package bth4;

import java.util.List;

public class Line extends Shape{
    int x, y;

    public Line(int x, int y){
        this.x = x;
        this.y = y;
    }

    public Line(Line other){
        this.x = other.x;
        this.y = other.y;
    }

    @Override
    public void operation() {
        System.out.println("Line");
    }

    @Override
    public void add(Shape shape) {

    }

    @Override
    public void remove(Shape shape) {

    }

    @Override
    public Shape getChild(int n) {
        return null;
    }

    @Override
    public Line clone() {
        return new Line(this);
    }
}

package bth4;

import java.util.ArrayList;
import java.util.List;

public class Graphic extends Shape{
    private List<Shape> shapes;

    public Graphic(){
        this.shapes = new ArrayList<>();
    }

    public Graphic(Graphic other){
        for (Shape shape : other.shapes){
            this.shapes.add(shape.clone());
        }
    }

    @Override
    public void operation() {
        for (Shape shape : shapes){
            shape.operation();
        }
    }

    @Override
    public void add(Shape shape) {
        shapes.add(shape);
    }

    @Override
    public void remove(Shape shape) {
        shapes.remove(shape);
    }

    @Override
    public Shape getChild(int n) {
        return shapes.get(n);
    }

    @Override
    public Graphic clone() {
        return new Graphic(this);
    }
}

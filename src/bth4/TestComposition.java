package bth4;

import java.util.List;

public class TestComposition {
    public static void main(String[] args){
        Line line = new Line(5,6);
        Circle circle = new Circle(7,8);
        Circle circle1 = circle.clone();
        Graphic graphic = new Graphic();
        graphic.add(line);
        graphic.add(circle1);
        graphic.add(circle);
        for (Shape shape : graphic.getShapes()) shape.operation();
    }
}

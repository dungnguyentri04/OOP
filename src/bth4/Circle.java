package bth4;

public class Circle extends Shape{
    int x,y;

    public Circle(int x, int y){
        this.x = x;
        this.y = y;
    }

    public Circle(Circle other){
        this.x = other.x;
        this.y = other.y;
    }

    @Override
    public void operation() {
        System.out.println("Circle");
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
    public Circle clone() {
        return new Circle(this);
    }
}

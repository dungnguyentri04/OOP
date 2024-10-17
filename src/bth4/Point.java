package bth4;

public class Point extends Shape{
    int x, y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public Point(Point other){
        this.x = other.x;
        this.y = other.y;
    }

    @Override
    public void operation() {
        System.out.println("Point");
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
    public Point clone() {
        return new Point(this);
    }
}

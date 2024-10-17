package bth4;

public abstract class Shape {
    public abstract void operation();
    public abstract void add(Shape shape);
    public abstract void remove(Shape shape);
    public abstract Shape getChild(int n);
    public abstract Shape clone();
}

package bth4;

public class Rectangular extends Shape{
    int x,y;

    public Rectangular(int x, int y){
        this.x = x;
        this.y = y;
    }

    public Rectangular(Rectangular other){
        this.x = other.x;
        this.y = other.y;
    }

    @Override
    public void operation() {
        System.out.println("Rectangular");
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
    public Rectangular clone() {
        return new Rectangular(this);
    }
}

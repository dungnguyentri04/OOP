package BTH2;

public class Ellipse extends Shape{
    private double a;
    private double b;

    public Ellipse(double x, double y,double a,double b) {
        super(x, y);
        this.a=a;
        this.b=b;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public double area(){
        return Math.PI*this.a*this.b;
    }
}

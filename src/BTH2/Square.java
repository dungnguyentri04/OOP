package BTH2;

public class Square extends Shape{
    private double bk;
    public Square(double x, double y,double bk) {
        super(x, y);
        this.bk=bk;
    }

    public double getBk() {
        return bk;
    }

    public void setBk(double bk) {
        this.bk = bk;
    }

    @Override
    public double area(){
        return Math.PI*this.bk*this.bk;
    }
}

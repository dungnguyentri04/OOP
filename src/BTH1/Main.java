package BTH1;

public class Main {
    public static void main(String[] args){
//        Point point = new Point(0,0,0);
//        point.printPoint();
        Complex c1 = new Complex(3,4);
        Complex c2 = new Complex(5,6);
        Complex c3 = Complex.addComplex(c1,c2);
        c3.displayComplex();
    }
}

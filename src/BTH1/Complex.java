package BTH1;

public class Complex {
    private double real;
    private double imaginary;

    public Complex(double real,double imaginary){
        this.real=real;
        this.imaginary=imaginary;
    }

    public double getReal(){
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void setReal(double real){
        this.real=real;
    }

    public void setImaginary(double imaginary){
        this.imaginary=imaginary;
    }

    public static Complex addComplex(Complex c1,Complex c2){
        return new Complex(c1.real+c2.real,c1.imaginary+c2.imaginary);
    }

    public static Complex subtract(Complex c1,Complex c2){
        return new Complex(c1.real-c2.real, c1.imaginary-c2.imaginary);
    }

    public static Complex multiply(Complex c1,Complex c2){
        return new Complex(c1.real* c2.real- c1.imaginary* c2.imaginary,c1.real*c2.imaginary+c2.real* c1.imaginary);
    }

    public void displayComplex(){
        System.out.println(real+"+" + imaginary+"i");
    }
}

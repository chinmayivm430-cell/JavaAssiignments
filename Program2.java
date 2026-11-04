class Complex {
    private double real;
    private double imaginary;

    Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    Complex add(Complex c) {
        return new Complex(real + c.real, imaginary + c.imaginary);
    }

    Complex multiply(Complex c) {
        double newReal = real * c.real - imaginary * c.imaginary;
        double newImaginary = real * c.imaginary + imaginary * c.real;
        return new Complex(newReal, newImaginary);
    }

    int compareMagnitude(Complex c) {
        double mag1 = Math.sqrt(real * real + imaginary * imaginary);
        double mag2 = Math.sqrt(c.real * c.real + c.imaginary * c.imaginary);

        return Double.compare(mag1, mag2);
    }

    Complex copy() {
        return new Complex(real, imaginary);
    }

    void display() {
        System.out.println(real + " + " + imaginary + "i");
    }

    void setReal(double real) {
        this.real = real;
    }
}

public class Program2 {
    public static void main(String[] args) {
        Complex c1 = new Complex(2, 3);
        Complex c2 = new Complex(4, 5);

        System.out.print("Sum: ");
        c1.add(c2).display();

        System.out.print("Product: ");
        c1.multiply(c2).display();

        Complex copy = c1.copy();
        c1.setReal(10);

        System.out.print("Original after modification: ");
        c1.display();

        System.out.print("Copied object: ");
        copy.display();
    }
}
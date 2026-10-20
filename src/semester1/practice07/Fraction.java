package semester1.practice07;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
        if (denominator == 0) {
            System.out.println("На нуль ділити не можна!");
            this.denominator = 1;
        }
        if (this.denominator < 0) {
            this.denominator = this.denominator * -1;
            this.numerator = this.numerator * -1;
        }
        for (int i = this.numerator / 2; i > 0; i--) {
            if ((this.numerator % i == 0) && (this.denominator % i == 0)) {
                this.denominator = this.denominator / i;
                this.numerator = this.numerator / i;
            }
        }
    }

    public Fraction(int wholeNumber) {
        this(wholeNumber, 1);
    }

    public Fraction() {
        this(0, 1);
    }

    public void print() {
        System.out.println(numerator + "/" + denominator);
        ;
    }

    public double toDouble() {
        return numerator / (denominator * 1.00);
    }
}

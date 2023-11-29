package faidom;

public class Hasab extends FaIdom {

    private double a, b, magassag;

    public Hasab(double a, double b, double magassag) {
        this.a = a;
        this.b = b;
        this.magassag = magassag;
    }

    @Override
    public double terfogat() {
        double t1 = a * b;
        return t1 * magassag;
    }

    @Override
    public String toString() {
        return "Hasáb{" + "a= " + a + "b= " + b + "magasság= " + magassag
                + "\ntérfogat= " + terfogat() + "súly= " + suly() + '}';
    }

}

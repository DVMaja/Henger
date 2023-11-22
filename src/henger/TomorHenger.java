package henger;

public class TomorHenger extends Henger {

    private double fajsuly;

    public TomorHenger(double sugar, double magassag) {
        super(sugar, magassag);
    }

    public TomorHenger(double fajsuly, double sugar, double magassag) {
        super(sugar, magassag);
        this.fajsuly = fajsuly;
    }

    public double getFajsuly() {
        return fajsuly;
    }

    public double suly() {
        return 1.0;
    }

    @Override
    public String toString() {
        String eredeti = super.toString();
        return eredeti + "TomorHenger{" + "fajsuly=" + fajsuly + '}';
    }

}

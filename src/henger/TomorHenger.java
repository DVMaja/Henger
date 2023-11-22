package henger;

public class TomorHenger extends Henger {

    private double fajsuly;

    public TomorHenger(double sugar, double magassag) {
        super(sugar, magassag);//1
    }

    public TomorHenger(double fajsuly, double sugar, double magassag) {
        super(sugar, magassag);
        this.fajsuly = fajsuly;
    }

    public double getFajsuly() {
        return fajsuly;
    }

    public double suly() {
        return 1.0;//faj* térf
    }

    @Override
    public String toString() {
        String eredeti = super.toString();
        return eredeti + "TomorHenger{" + "fajsuly=" + fajsuly + '}';
    }

}

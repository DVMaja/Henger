package henger;

public class Cso extends TomorHenger {

    private double falvastagsag;

    public Cso(double falvastagsag, double sugar, double magassag) {
        super(sugar, magassag);
        this.falvastagsag = falvastagsag;
    }

    public Cso(double falvastagsag, double fajsuly, double sugar, double magassag) {
        super(fajsuly, sugar, magassag);
        this.falvastagsag = falvastagsag;
    }

    @Override
    public double terfogat() {
        return 2.0;
    }

    @Override
    public String toString() {
        String eredeti = super.toString();
        return eredeti + "Cso{" + "falvastagsag=" + falvastagsag + '}';
    }

}

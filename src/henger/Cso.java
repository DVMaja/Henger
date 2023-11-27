package henger;

public class Cso extends TomorHenger {

    private double falvastagsag;

    public Cso(double sugar, double magassag) {
        super(sugar, magassag);
        //this.falvastagsag = falvastagsag;
    }

    public Cso(double sugar, double magassag, double fajsuly, double falvastagsag) {
        super(fajsuly, sugar, magassag);
        this.falvastagsag = falvastagsag;
    }

    @Override
    public double terfogat() {
        double eredetiT = super.terfogat();
        double ujT = super.getSugar() - falvastagsag;
        return eredetiT - ujT;
    }

    @Override
    public String toString() {
        String eredeti = super.toString();
        return eredeti + "Cso{" + "falvastagsag=" + falvastagsag + '}';
    }

}

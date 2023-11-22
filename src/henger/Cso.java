package henger;

public class Cso extends TomorHenger {

    private double falvastagsag;

    public Cso(double falvastagsag, double sugar, double magassag) {
        super(sugar, magassag);//sugar m, 1, falvast
        //this.falvastagsag = falvastagsag;
    }

    public Cso(double sugar, double magassag, double fajsuly , double falvastagsag) {
        super(fajsuly, sugar, magassag);
        this.falvastagsag = falvastagsag;
    }

    @Override
    public double terfogat() {
        return super.terfogat();
    }

    @Override
    public String toString() {
        String eredeti = super.toString();
        return eredeti + "Cso{" + "falvastagsag=" + falvastagsag + '}';
    }

}

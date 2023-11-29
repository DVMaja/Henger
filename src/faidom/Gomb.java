package faidom;

public class Gomb extends FaIdom {

    private double sugar;

    public Gomb(double sugar) {
        this.sugar = sugar;
    }

    @Override
    public double terfogat() {
        return (4 * Math.pow(sugar, 3) * Math.PI) / 3;
    }

    @Override
    public String toString() {
        String eredeti = super.toString();
        return eredeti + "Gömb{" + "sugár= " + sugar + " térfogat= " + terfogat() + "súly= " + suly() + '}';
    }

}

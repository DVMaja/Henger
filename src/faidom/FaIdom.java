package faidom;

abstract public class FaIdom {

    private static double fajsuly = 0.8;

    public abstract double terfogat();

    public double suly() {
        return fajsuly * terfogat();
    }

    @Override
    public String toString(){
        return "Faidom:  ";
    };

}

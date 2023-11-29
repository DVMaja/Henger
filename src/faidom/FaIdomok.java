package faidom;

public class FaIdomok {

    //private final List<FaIdom> idomok = Arrays.asList(new FaIdom[5]);
    private FaIdom[] idomok;

    public FaIdomok() {
        idomok = new FaIdom[4];

        idomok[0] = new Gomb(2);
        idomok[1] = new Hasab(2, 4, 6);
        idomok[2] = new Gomb(5);
        idomok[3] = new Hasab(2, 3, 7);
        idomok[4] = new Hasab(2, 1, 4);
        run();
    }

    public void run() {

        minV();
        maxV();
        OsszSuly();
        gombOsszSuly();

    }

    public void minV() {//FaIdom
        //___ minTerfogat = idomok[0];
//        for (int i = 1; i < idomok.length; i++) {
//            if (idomok[i-1].terfogat > idomok[i].terfogat) {
//                minTerfogat = idomok[i];
//            }            
//        }

    }

    public void maxV() {//FaIdom

    }

    public double OsszSuly() {
        double osszSulya = 0;
//        for (FaIdom fi : idomok) {
//            osszSulya += fi.suly();
//        }
        return osszSulya;
    }

    public double gombOsszSuly() {
        double osszSulya = 0;
//        for (FaIdom fi : idomok) {
//            if (fi instanceof Gomb) {
//                osszSulya += fi.suly();
//            }
//        }
        return osszSulya;
    }
}

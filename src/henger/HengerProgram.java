package henger;

import java.util.List;

public class HengerProgram {

    //private List[] hengerek = new List[4];//4 dbnak kell lennie
    private Henger[] hengerek;

    public HengerProgram() {
    }

    public static void main(String[] args) {
        HengerProgram hengerP = new HengerProgram();
        hengerP.run();
    }

    private void run() {
        lista();
        int db = Henger.getHengerDarab();
        double atlagV = atlagTerfogat();

        csovekSulya();

    }

    public double atlagTerfogat() {
        return 1.0;
    }

    public double csovekSulya() {
        return 1.0;
    }

    private void lista() {
        hengerek = new Henger[4];
        hengerek[0] = new Henger(1, 1);
        hengerek[1] = new TomorHenger(1, 1);
        //hengerek[2] = new Cso(1, 1, 5);
//        hengerek[3] = new Cso(1, 1, 1);

        for (Henger h : hengerek) {
            System.out.println(h);
        }
    }

}

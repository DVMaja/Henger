package henger;

import java.util.List;

public class HengerProgram {

    private List hengerek;//4 dbnak kell lennie

    public HengerProgram() {
    }

    public static void main(String[] args) {
        HengerProgram hengerP = new HengerProgram();
        hengerP.run();
    }

    private void run() {
        atlagTerfogat();
        csovekSulya();
        lista();
    }

    public void atlagTerfogat() {
    }

    public void csovekSulya() {

    }

    private List lista() {
        return hengerek;

    }

}

package hu.petrik.szuperhosprojekt;

public class Vasember extends Bosszuallo implements Milliardos{

    public Vasember() {
        super(150, true);
    }

    @Override
    public boolean megmentiAVilagot() {
        if (getSzuperero() > 1000) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void kutyutKeszit() {
        double ero = getSzuperero();
        ero += Math.random() * 10 + 1;
        setSzuperero(ero);
    }

    @Override
    public String toString() {
        return "Vasember: " + super.toString();
    }
}
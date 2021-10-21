package hu.petrik.szuperhosprojekt;

public class Batman implements Szuperhos, Milliardos{
    private double lelemenyesseg;

    public Batman() {
        this.lelemenyesseg = 100;
    }

    @Override
    public void kutyutKeszit() {
        lelemenyesseg += 50;
    }

    @Override
    public boolean legyoziE(Bosszuallo hos) {
        if (lelemenyesseg > hos.getSzuperero()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public double mekkoraAzEreje() {
        return lelemenyesseg * 2;
    }

    @Override
    public String toString() {
        return "Batman: leleményessége: " + lelemenyesseg;
    }
}

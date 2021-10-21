package hu.petrik.szuperhosprojekt;

import java.text.Format;

public abstract class Bosszuallo implements Szuperhos {
    private double szuperero;
    private boolean vanEGyengesege;

    public Bosszuallo(double szuperero, boolean vanEGyengesege) {
        this.szuperero = szuperero;
        this.vanEGyengesege = vanEGyengesege;
    }

    public abstract boolean megmentiAVilagot();

    @Override
    public double mekkoraAzEreje() {
        return szuperero;
    }

    @Override
    public boolean legyoziE(Bosszuallo hos) {
        if (szuperero > hos.mekkoraAzEreje() && hos.vanEGyengesege) {
            return true;
        } else {
            return false;
        }
    };

    public double getSzuperero() {
        return szuperero;
    }

    public boolean getVanEGyengesege() {
        return vanEGyengesege;
    }

    public void setSzuperero(double szuperero) {
        this.szuperero = szuperero;
    }

    public void setVanEGyengesege(boolean vanEGyengesege) {
        this.vanEGyengesege = vanEGyengesege;
    }

    @Override
    public String toString() {
        return String.format("Erő = %f; Van-e gyengesége = %b", szuperero, vanEGyengesege);
    }
}

package hu.petrik.szuperhosprojekt;

public class Main {

    public static void main(String[] args) {
        Bosszuallo b1 = new Bosszuallo(10, true) {
            @Override
            public boolean megmentiAVilagot() {
                return false;
            }

            @Override
            public boolean legyoziE(Szuperhos hos) {
                return false;
            }
        };
        Vasember v1 = new Vasember();
        Batman bat1 = new Batman();
        System.out.println(b1);
        System.out.println(v1);
        System.out.println(bat1);
        System.out.println("\n\n");
        Kepregeny.szereplok("szuperhos.txt");
        Kepregeny.szuperhosok();
    }
}

package hu.petrik.szuperhosprojekt;

public class Main {

    public static void main(String[] args) {
        Bosszuallo b1 = new Bosszuallo(10, true) {
            @Override
            public boolean megmentiAVilagot() {
                return false;
            }

            @Override
            public boolean legyoziE(Bosszuallo hos) {
                return false;
            }
        };
        System.out.println(b1);
    }
}

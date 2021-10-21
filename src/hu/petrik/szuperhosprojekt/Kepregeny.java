package hu.petrik.szuperhosprojekt;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Kepregeny {
    private static List<Szuperhos> szuperhosLista = new ArrayList<>();

    public static void szereplok(String fajlNev) {
        List<String> list = new ArrayList<String>();
        try {
            list = (ArrayList<String>) Files.readAllLines(Paths.get(fajlNev));
        } catch (IOException e) {
            e.printStackTrace();
        }

        Vasember v = new Vasember();
        Batman b = new Batman();
        for (String l: list) {
            String[] egysor = l.split(" ");
            if (egysor[0] == "Vasember") {
                for (int i = 0; i < Integer.parseInt(egysor[1]); i++) {
                    v.kutyutKeszit();
                }
            } else {
                for (int i = 0; i < Integer.parseInt(egysor[1]); i++) {
                    b.kutyutKeszit();
                }
            }
        }
        szuperhosLista.add(v);
        szuperhosLista.add(b);
    }

    public static void szuperhosok() {
        for (Szuperhos s : szuperhosLista) {
            System.out.println(s);
        }
    }
}

package backtracking;

import java.util.Random;

public class Main {

    static Random rnd;

    public static void main(String[] args) {
        //Backtracking_L labyrinth = new Backtracking_L();
        //Backtracking_D dame = new Backtracking_D();

        /*Bingo: */
        rnd = new Random();
        Ziehungsgerät gerät = new Ziehungsgerät(rnd);
        Bingokarte karte = new Bingokarte(rnd);
        while (!karte.istBingo()) {
            karte.anzeigen();
            Kugel neu = gerät.anzeigen();
            gerät.anzeigetafel.anzeigen();
            karte.makiereFeld(neu.zahl);
        }
        karte.anzeigen();
        System.out.println("BINGOOOO!");

    }

}

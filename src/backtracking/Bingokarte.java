/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backtracking;

import java.util.Random;

/**
 *
 * @author BuschA9
 */
public class Bingokarte {

    Kugel[][] karte;
    Random rnd;

    public Bingokarte(Random rand) {
        rnd = rand;
        karte = new Kugel[5][5];

        int[] grenze = {1, 16, 31, 46, 61};

        int zahl;

        for (int zeile = 0; zeile < 5; zeile++) {
            for (int spalte = 0; spalte < 5; spalte++) {
                karte[spalte][zeile] = new Kugel();
                if (zeile == 2 && spalte == 2) {
                    karte[spalte][zeile].zahl = 0;
                }
                else{
                    zahl = rnd.nextInt(15) + grenze[zeile];
                    karte[spalte][zeile].set_Zahl(zahl);
                }
            }
        }
    }

    public void makiereFeld(int feld) {
        for (int spalte = 0; spalte < 5; spalte++) {
            for (int zeile = 0; zeile < 5; zeile++) {
                if (karte[spalte][zeile].zahl == feld) {
                    karte[spalte][zeile].zahl = 0;
                }
            }
        }
    }

    public boolean istBingo() {
        int bingo = 0;
        for (int spalte = 0; spalte < 5; spalte++) {
            for (int zeile = 0; zeile < 5; zeile++) {
                if (karte[spalte][zeile].zahl == 0) {
                    bingo++;
                    if (bingo == 5) {
                        return true;
                    }
                } else {
                    bingo--;
                }
            }
            
        }
        for (int zeile = 0; zeile < 5; zeile++) {
            for (int spalte = 0; spalte < 5; spalte++) {
                if (karte[spalte][zeile].zahl == 0) {
                    bingo++;
                    if (bingo == 5) {
                    return true;
                    }
                } else {
                    bingo--;
                }
            }
            
        }
        if (karte[0][0].zahl == 0 && karte[1][1].zahl == 0 && karte[3][3].zahl == 0 && karte[4][4].zahl == 0) {
            return true;
        } else if (karte[0][4].zahl == 0 && karte[1][3].zahl == 0 && karte[3][1].zahl == 0 && karte[4][0].zahl == 0) {
            return true;
        }

        return false;
    }

    public void anzeigen() {
        System.out.println(" B   I   N   G   O  ");
        for (int spalte = 0; spalte < 5; spalte++) {
            for (int zeile = 0; zeile < 5; zeile++) {
                if(karte[spalte][zeile].zahl == 0)
                    System.out.print(" >< ");
                else
                    System.out.printf(" %02d ", karte[spalte][zeile].zahl);
            }
            System.out.println();
        }
        System.out.println();
    }

}

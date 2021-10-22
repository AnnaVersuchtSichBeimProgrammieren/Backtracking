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
public class Ziehungsgerät {
    
    Anzeigetafel anzeigetafel;
    Random rnd;
    
    public Ziehungsgerät(Random rand){
        anzeigetafel = new Anzeigetafel();
        rnd = rand;
    }
    
    public Kugel gibKugel(){
        Kugel neue_Kugel = new Kugel();
        if(istLeer()){
           return neue_Kugel; 
        }
        int zahl = rnd.nextInt(75)+1;
        if(anzeigetafel.prüfen(zahl)){
            neue_Kugel.set_Zahl(zahl);
            anzeigetafel.nimmKugel(neue_Kugel);
            return neue_Kugel;
        }
        else{
            neue_Kugel = gibKugel();
        }
        return neue_Kugel;
    }
    
    public boolean istLeer(){
        boolean leer = true;
        for(int x = 0; x < 75; x++)
            if(anzeigetafel.prüfen(x+1)){
                return !leer;
            }
        return leer;
    }
    
    public Kugel anzeigen(){
        Kugel neu = gibKugel();
            System.out.println("    ________");
            System.out.println("   /        \\");
            System.out.println("  /          \\");
            System.out.println("  |    _     |");
            System.out.println("--|  _|%| _  |--");
            System.out.println("| \\ |%|  |%| / |");
            System.out.println("|  ---| |----  |");
            System.out.println("|              |");
            System.out.println("/\\    ___      /\\");
            System.out.println("     |   |");
            System.out.printf("     |%c%02d|\n", neu.buchstabe, neu.zahl);
            System.out.println("     -----");
            System.out.println();
            return neu;
    }
    
}

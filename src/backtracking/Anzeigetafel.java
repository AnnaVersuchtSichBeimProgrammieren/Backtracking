/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backtracking;

/**
 *
 * @author BuschA9
 */
public class Anzeigetafel {
    
    boolean[] Tafel;
    
    public Anzeigetafel(){
        Tafel = new boolean[75];
        for(int x = 0; x < 75; x++)
            Tafel[x]=true;
    }
    
    public void nimmKugel(Kugel kugel){
        Tafel[kugel.zahl-1] = false;
    }
    
    public void anzeigen(){
        for(int x = 0; x < 75; x++){
            if(x == 15 || x == 30 || x == 45 || x == 60)
                System.out.println();
            if(!Tafel[x]){
                Kugel da = new Kugel();
                da.set_Zahl(x+1);
                System.out.printf("%c%02d ", da.buchstabe , da.zahl);
            }
            else{
                System.out.print("    ");
            }
        }
        System.out.println();
        System.out.println();
    }
    
    public boolean prüfen(int zahl){
        return Tafel[zahl-1];
    }
    
}

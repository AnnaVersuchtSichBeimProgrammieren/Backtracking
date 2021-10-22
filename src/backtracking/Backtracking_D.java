package backtracking;


public class Backtracking_D {
    
    Map[][] Brett = new Map[7][7];
    Map Dame;
    int Damen_gesetzt;
    
    public Backtracking_D(){
        Damen_gesetzt = 0;
        Brett_fuellen();
        Dame_setzen(6, 0);
    }
    
    public void Brett_fuellen(){
        int dia1;
        int dia2;
        for(int spalte = 0; spalte < 7; spalte++){
            for(int zeile = 0; zeile < 7; zeile++){
                dia1 = zeile - spalte;
                dia2 = zeile + spalte;
                Brett[zeile][spalte] = new Map(dia1, dia2);
                System.out.print(Brett[zeile][spalte].Diagonale1 + "." + Brett[zeile][spalte].Diagonale2 + "  ");
            }
            System.out.println();
        }
    }
    
    public void Dame_setzen(int zeile, int spalte) {
        if(Damen_gesetzt == 0){
            Dame = Brett[zeile][spalte];
            Damen_gesetzt++;
        }
        
        
        
        
    }
}

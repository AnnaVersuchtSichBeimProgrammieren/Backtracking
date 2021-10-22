package backtracking;

public class Backtracking_L {
    
    int akZeile;
    int akSpalte;
    char[][] map;
    
    String[] strFeld =
	{
	"XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX",
	"XXXXXXXXXXXXXXXXXXXXXXX        XXXXXXX XX          Z",
	"XS                 XXXX XXXXXXXXXX     XX XXXXXXX XX",
	"XXXXXXXXXXXXXXXXXX XXXX XXX    XXX XXXXXX XXXXXXX XX",
	"XXXXXX   XXXXXXXXX XXXX XXX XX XXX XXXXXX XXXXXXX XX",
	"XXXXXX XXXX        XXXX XXX XX XXX XXXXXX XXXXXXX XX",
	"XXXXXX XXXX XXXXXX XXXX XXX XX     XX XXX XXXXXXX XX",
	"XXXXXX XXXX XXXXXX XXXX XXX XXXXXXXXX XXX XXXXXXX XX",
	"XXXXXX XXXX XXXXXX XXXX XXX XXXXXXXXX XXX         XX",
	"XXXXXX      XXXXXX                        XXXXXXXXXX",
	"XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX" };
    
    public char[][] LabyrinthMap() {
        char[][] list = new char[11][52];
        for (int i = 0; i < 11; i++) {
            list[i] = strFeld[i].toCharArray();
        }
        return list;
    }
    
    public Backtracking_L(){
        map = LabyrinthMap();
        schritte = 0;
        ausgabe();
        woStart();
        laufen(akZeile, akSpalte);
    }
            
    public void ausgabe(){
        for(int zeile = 0; zeile < 11; zeile++){
            for(int spalte = 0; spalte < 52; spalte++){
                System.out.print(map[zeile][spalte] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        System.out.println();
    }
    
    public void woStart(){
        for(int zeile = 0; zeile < 11; zeile++){
            for(int spalte = 0; spalte < 52; spalte++){
                if(map[zeile][spalte] == 'S'){
                    akZeile = zeile;
                    akSpalte = spalte;
                    return;
                }
            }
        }
    }
    
    int schritte;
    
    public void laufen(int zeile, int spalte){
        schritte++;
        
        if(map[zeile][spalte] == 'Z'){
            ausgabe();
            
        }
        else if(map[zeile][spalte] != ' ' && map[zeile][spalte] != 'S'){
            return;
        }
        else{
            map[zeile][spalte] = 'I';
            laufen(zeile, spalte+1);
            laufen(zeile+1, spalte);
            laufen(zeile, spalte-1);
            laufen(zeile-1, spalte);
            map[zeile][spalte] = ' ';
        }
    }
}
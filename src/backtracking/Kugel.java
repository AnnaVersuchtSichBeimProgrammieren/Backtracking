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
public class Kugel {
    
    int zahl;
    char buchstabe;
    
    public Kugel(){
        
    }
    
    public Kugel(int Zahl){
        set_Zahl(Zahl);
    }
    
    public void set_Zahl(int nummer){
        zahl = nummer;
        if(zahl < 16)
            buchstabe = 'b';
        else if(zahl < 31)
            buchstabe = 'i';
        else if(zahl < 46)
            buchstabe = 'n';
        else if(zahl < 61)
            buchstabe = 'g';
        else
            buchstabe = 'o';
    }
    
}

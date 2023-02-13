/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teszt;

import modell.Auto;
import modell.Jarmu;

class Hajo extends Jarmu{
    
}

public class JarmuvekTeszt {
    public static void main(String[] args) {
        new JarmuvekTeszt();
    }
    
    public JarmuvekTeszt(){
        //mintaSablonTeszt();
        uzemanyagTeszt();
    }
    
    private void uzemanyagTeszt(){
        Auto auto = new Auto();
        boolean kapott = auto.beindit();
        boolean vart = true;
        assert kapott == vart : "Az autó nincs beindítva";
    }
    
    public void mintaSablonTeszt(){
        int kapott  = 7;
        int vart = 4;
        assert kapott == vart : "nem egyeznek";
    }
}

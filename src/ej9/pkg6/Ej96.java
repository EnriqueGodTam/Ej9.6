
package ej9.pkg6;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Ej96 {

    public static void main(String[] args) {
        Alumno alu = new Alumno ("Pedro");
        
        try {
            alu.modificarNota(2, 7);
        } catch (RangoException ex) {
            Logger.getLogger(Ej96.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}

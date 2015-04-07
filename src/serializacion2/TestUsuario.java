/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializacion2;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author T-107
 */
public class TestUsuario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creamos un usuario
        
        Usuario u=new Usuario();
        u.setEmail("game.over@gmail.com");
        u.setNombre("Alonso");
        u.setSueldo(40000);
        
        //Lo guardamos
        
        PersistenciaUsuario per=new PersistenciaUsuario();
        try {
            per.guardar(u);
            
            System.out.println("Usuario guardado con exito");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializacion2;

/**
 *
 * @author T-107
 */

import java.io.*;


public class PersistenciaUsuario {
    
    
    public void guardar(Usuario u)throws Exception{
        //PASO 1 (CREAR EL ARCHIVO)
        File file=new File("D:\\archivaldo.chichis");
             //constructor lleva ruta y nombre del archivo
        
        
        //PASO 2(SACARLO PARA ESCRIBIRLO)
        
        FileOutputStream fos=new FileOutputStream(file);
        
        //PASO 3 (LLENARLO CON ALGO , ESE ALGO EN ESTE CASO ES UN USUARIO)
        
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        
        oos.writeObject(u);  //ESTE AYUDA A GUARDARLO
        oos.close();     
        
    }
    
    public Usuario leer()throws Exception{
        
        File file=new File("D:\\archivaldo.chichis");
        
        FileInputStream fis=new FileInputStream(file);
        
        ObjectInputStream ois=new ObjectInputStream(fis);
        
        Usuario u=new Usuario();
        
        u=(Usuario)ois.readObject();
        
        return u;
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paca.barrio;

import java.util.*;


public class ModeloGaleria {
    
    public static ArrayList<Galeria> generarGaleria(){
       ArrayList<Galeria> arreglo=new ArrayList<Galeria>();
       
                   //Constructor(Galeria)
       Galeria g1=new Galeria("Titulo 1","Mi descripcion 1","/paca/barrio/uno.jpg");
       Galeria g2=new Galeria("Titulo 2","Mi descripcion 2","/paca/barrio/dos.jpg");
       Galeria g3=new Galeria("Titulo 3","Mi descripcion 3","/paca/barrio/tres.jpg");
       
       arreglo.add(g1);
       arreglo.add(g2);
       arreglo.add(g3);
       
       return arreglo;
               
    }
    
}

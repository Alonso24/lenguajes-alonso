
package unitec.proyecto.geometria;

import java.util.*;

public class GenerarSuperficies {
 
    public static ArrayList<Superficies> obtenerFiguras() throws Exception{
        
        
        ArrayList<Superficies> figuritas=new  ArrayList<Superficies>();
        //primero creamos cuadrados
        
        Cuadrado cu1=new Cuadrado(12);
        Cuadrado cu2=new Cuadrado(14);
        Cuadrado cu3=new Cuadrado(13);
        
        // Crear 1 rectangulo
        
        
        Rectangulo re1=new Rectangulo(12,10);
       
        // Crear 2 triangulos
        
        Triangulo tr1=new Triangulo(15,2);
        Triangulo tr2=new Triangulo(4,2);
        
        //Crear 2 circulos
        
        Circulo c1=new Circulo(13);
        Circulo c2=new Circulo(15);
        
        //agregarlos al Arraylist "figuritas"
        
        figuritas.add(cu1);
        figuritas.add(cu2);
        figuritas.add(cu3);
        figuritas.add(re1);
        figuritas.add(tr1);
        figuritas.add(tr2);
        figuritas.add(c1);
        figuritas.add(c2);
        
    return figuritas;
    }
    
     
}


package Repaso1;

import java.util.*;

public class GenerarAnimales {
public static ArrayList <Animal> generarAnimales(){
    
    ArrayList <Animal> animales=new ArrayList<Animal>();
    Animal a1=new Animal ("Leon",2);
    Animal a2=new Animal ("Delfin",6);
    animales.add(a1);
    animales.add(a2);
    return animales;
    
}    
}

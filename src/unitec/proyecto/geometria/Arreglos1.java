/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unitec.proyecto.geometria;

/**
 *
 * @author T-301
 */
public class Arreglos1 {
    
    public void tuNombre(int x []){
        
    }
    
    public static void main(String[] args) {
        
        int x[]=new int[3];
        int []y=new int[3];
        int z[]={1,-200,45};
        
        /* ERRORES
        int w=new int [];
        int j[3]=new int [];
        int m[4]=new int[4];
        int []n={1,4.5,3};
        */
        
        x[0]=127;
        x[1]=200;
        x[2]=-23;
        // Solo es de 2 no de 3    x[3]=12;
        
        //ITERAR
        
        for(int i=0;i<x.length;i++){
            
            System.out.println(x[i]);
        }
        
        
    }
    
}
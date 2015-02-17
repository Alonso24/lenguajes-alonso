/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unitec.proyecto.geometria;

import javax.xml.crypto.dsig.spec.C14NMethodParameterSpec;

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
        
        int a=2;
        float b=0;
        System.out.println(a/b);

        // for antiguo
        for(int i=0;i<4;i++){
            
            System.out.println(x[i]);
        }
          
       
        
        System.out.println("Si ocurre la excepcion "+ "Nunca me veras");
        
        //for mejorado
        for(int algodon:x){
            System.out.println(algodon);
        }
    Cuadrado c=new Cuadrado ();
    }
    
}

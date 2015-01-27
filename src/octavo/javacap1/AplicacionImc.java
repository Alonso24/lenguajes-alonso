/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package octavo.javacap1;


public class AplicacionImc {

    
    public static void main(String[] args) {
        
        Imc objeto;
        objeto=new Imc();
        //
    
        
           System.out.println("Tu imc es:"+objeto.calcular(-1.68f, 86f));
                
    }
    
}

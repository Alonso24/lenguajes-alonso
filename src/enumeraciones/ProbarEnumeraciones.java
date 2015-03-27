/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enumeraciones;

/**
 *
 * @author T-301
 */
public class ProbarEnumeraciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
    
    
    MaquinaBuena maquina=new MaquinaBuena();
    maquina.setEstado(EstadoDeMaquina.LINEA);
        System.out.println("El estado de la maquina es:"+maquina.getEstado());
    
    }
    
}

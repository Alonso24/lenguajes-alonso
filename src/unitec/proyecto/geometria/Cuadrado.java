package unitec.proyecto.geometria;

/**
 *
 * @author T-107
 */
public class Cuadrado {
    
    
    private float lado;
   
    /**
     * Este constructor tiene un argumento
     */
    
    
    
    public Cuadrado (){
        
       
        
    }
    public  Cuadrado (float lado) throws NumeroNoNegativoException{
        
        /*ValidarValorNoNegativo valida=new ValidarValorNoNegativo();
                valida.validar(lado);
        */
        
        ValidarValorNoNegativo.validar(lado);
       this.lado=lado;
       
   } 
    float calcularArea(){
        
        float area=lado*lado;
        return area;
        
    }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) throws NumeroNoNegativoException {
         ValidarValorNoNegativo.validar(lado);
        this.lado = lado;
    }
          
}

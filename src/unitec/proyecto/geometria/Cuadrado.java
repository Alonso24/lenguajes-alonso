package unitec.proyecto.geometria;

/**
 *
 * @author T-107
 */
public class Cuadrado {
    
    private float lado;
    
    float calcularArea(){
        
        float area=lado*lado;
        return area;
        
    }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }
          
}
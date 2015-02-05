
package cuadrado_rectangulo;

public class cuadrado {

   private int lado;
   public void setLado(int lado){
   this.lado=lado;
   }
   
   public int getLado(){
   return lado;
   }
}


public int calcularArea(){

int area = lado*lado;

return area;

}

   
    
    /*
    void setLado(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    boolean calcularArea() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
*/
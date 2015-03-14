
package com.capitulo6.threads;

/**
 *
 * @author T-301
 */
public class ProbarThreads {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Probar Threads");
        //Paso 1: Crearlo 
        Facil t1=new Facil();
        Facil t11=new Facil();
        Reloj treloj=new Reloj();
        Regular r1=new Regular(); //r es de runnable
        //Hugo thugo=new Hugo();
        //Paco tpaco=new Paco();
        //Luis tluis=new Luis();
        Thread t2=new Thread(r1);
        
        Thread t3=new Thread(new Runnable(){

            @Override
            public void run() {
                System.out.println("Soy un thread mucho mejor");
            }
            
        }
        );//constructor clase thrad
       
        Thread h=new Thread(new Runnable() {

            @Override
            public void run() {
             try{
            Thread.sleep(3000);
        Thread.currentThread().setName("Hugo");
        String nombre=Thread.currentThread().getName();
        System.out.println("Hola soy " +nombre);
    
        }catch(InterruptedException e) {}
          
            }
        }
        );
        
        Thread p=new Thread(new Runnable() {

            @Override
            public void run() {
             try{
            Thread.sleep(6000);
        Thread.currentThread().setName("Paco");
        String nombre=Thread.currentThread().getName();
        System.out.println("Hola soy " +nombre);
    
        }catch(InterruptedException e) {}
          
            }
        }
        );
        Thread l=new Thread(new Runnable() {

            @Override
            public void run() {
             try{
            Thread.sleep(9000);
        Thread.currentThread().setName("Luis");
        String nombre=Thread.currentThread().getName();
        System.out.println("Hola soy " +nombre);
    
        }catch(InterruptedException e) {}
          
            }
        }
        );
        
        //t1.setName("Petra");
        //Paso 2: Inicializar
        //t1.start();
        //t11.start();
        //t2.start();
        //t3.start();
        //treloj.start();
         // thugo.start();
          //tpaco.start();
          //tluis.start();
    h.start();
    p.start();
    l.start();
    }
    
}

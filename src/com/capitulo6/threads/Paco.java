/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.capitulo6.threads;

/**
 *
 * @author ALGZ
 */
public class Paco extends  Thread{
    
    public void run(){
        try{
            Thread.sleep(6000);
        System.out.println("Hola soy Paco");
        //String nombre=Thread.currentThread().getName();
        //System.out.println("Me llamo" +nombre);
    
        }catch(InterruptedException e) {}
        
    }
    
}

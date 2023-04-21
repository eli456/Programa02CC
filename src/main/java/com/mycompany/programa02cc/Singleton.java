/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programa02cc;

/**
 *
 * @author irvin
 */
public class Singleton {
    
    private static Singleton singleton = null;
    
    public static Singleton getInstance() {
        if (singleton == null)
            singleton = new Singleton();
        
        return singleton;
    }
    
    private Singleton () {
        
    }
    
    public void Imprimir() {
        System.out.println("Hola mundo ...");
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial;

/**
 *
 * @author DELL
 */
public class Carro {
    String marca;
    String modelo;
    String color;
    int precio;
   
    
    public void correr() {
        
        System.out.println ("El carro " + marca + "  modelo " + modelo + "  color " + color+ "  cuesta " + precio); 
    }
}

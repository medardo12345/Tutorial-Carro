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
public class Tutorial {
    
    public static void main (String [] args){
        
        Carro micarro=new Carro();
        micarro.marca="nissan";
        micarro.color="negro";      
        micarro.modelo="xl";        
        micarro.precio=30000000;
        
        
        micarro.correr();
    }
    
}

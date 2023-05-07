/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

public abstract class teoriaAnimal {

    protected String nombre;
    protected String clase;
    
    
 
    public void hacerRuido(){
        System.out.println("Hola");
    }

  public abstract void nombreClase();
    
}

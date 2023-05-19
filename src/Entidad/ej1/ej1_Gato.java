/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad.ej1;

/**
 *
 * @author Usuario
 */
public class ej1_Gato extends ej1_Animal{

    public ej1_Gato(String nombre, String alimento, int edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

    
    
    @Override
    public void Alimentarse() {
               System.out.println("El " + raza + " de nombre " + nombre + " se alimenta de " + alimento );

    }
    
}

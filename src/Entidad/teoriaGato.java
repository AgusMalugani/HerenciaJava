/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Usuario
 */
public class teoriaGato extends teoriaAnimal {
    
    @Override
    public void hacerRuido(){
        System.out.println("maullar");
    }

    @Override
    public void nombreClase() {
nombre = "Gatito";
clase  = "Gato";

        System.out.println(nombre + " " + clase);



    }
    
}

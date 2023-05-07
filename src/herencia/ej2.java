/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

import Entidad.ej2_Electrodomestico;
import Entidad.ej2_Lavadora;
import Entidad.ej2_Televisor;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        ej2_Lavadora lavadora = new ej2_Lavadora();  // tendria que llamar al servicio
        
       lavadora = lavadora.crearLavadora(); // crear objeto entidad lavadora y llamo al serviico y lo guardo
       lavadora.precioFinal(lavadora); // llamo el metodo del servicio y le paso x parametro el entidad de lavadora.
        System.out.println(" ");
       ej2_Televisor tele = new ej2_Televisor();
       tele = tele.crearTelevisor();
       tele.precioFinal(tele);
       
        
    }
    
}

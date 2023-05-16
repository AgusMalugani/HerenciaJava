/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

import Entidad.ej2_Electrodomestico;
import Entidad.ej2_Lavadora;
import Entidad.ej2_Televisor;
import java.util.ArrayList;
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
        Scanner leer = new Scanner(System.in);

        ej2_Lavadora lavadora = new ej2_Lavadora();  // tendria que llamar al servicio

        lavadora = lavadora.crearLavadora(); // crear objeto entidad lavadora y llamo al serviico y lo guardo
        lavadora.precioFinal(lavadora); // llamo el metodo del servicio y le paso x parametro el entidad de lavadora.

        System.out.println(" ");

        ej2_Televisor tele = new ej2_Televisor();
        tele = tele.crearTelevisor();
        tele.precioFinal(tele);

        ArrayList<ej2_Electrodomestico> electro = new ArrayList<ej2_Electrodomestico>();
        electro.add(lavadora);
        electro.add(tele);

        ej2_Televisor tele2 = new ej2_Televisor();
        tele2 = tele2.crearTelevisor();
        tele2.precioFinal(tele2);
        electro.add(tele2);

        ej2_Lavadora lavadora2 = new ej2_Lavadora();
        lavadora2 = lavadora2.crearLavadora();
        lavadora2.precioFinal(lavadora2);
        electro.add(lavadora2);

        for (ej2_Electrodomestico aux : electro) {
            System.out.println(aux);
        }

        int precioTotal = 0;
        int totalLavadora = 0;
        int totalTelevisor = 0;
        for (ej2_Electrodomestico aux : electro) {
            if (aux instanceof ej2_Lavadora) {
                ej2_Lavadora object = (ej2_Lavadora) aux;
                totalLavadora += aux.getPrecio();
                precioTotal += aux.getPrecio();
                continue;
            }
            if (aux instanceof ej2_Televisor) {
                ej2_Televisor object = (ej2_Televisor) aux;
                totalTelevisor += aux.getPrecio();
                precioTotal += aux.getPrecio();
                continue;
            }

        }
        System.out.println("El precio total de todos los electrodomesticos es de : $" + precioTotal);
        System.out.println(" $ " + totalTelevisor + " Corresponde a televisores y $" + totalLavadora + " Corresponde a lavadoras");

    }

}

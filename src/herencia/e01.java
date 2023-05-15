/*
En un puerto se alquilan amarres para barcos de distinto tipo. Para cada Alquiler se guarda: el
nombre, documento del cliente, la fecha de alquiler, fecha de devolución, la posición del
amarre y el barco que lo ocupará.  



Un Barco se caracteriza por: su matrícula, su eslora en metros y año de fabricación.

Sin embargo, se pretende diferenciar la información de algunos tipos de barcos especiales:
• Número de mástiles para veleros.
• Potencia en CV para barcos a motor.
• Potencia en CV y número de camarotes para yates de lujo.

Un alquiler se calcula multiplicando el número de días de ocupación (calculado con la fecha de
alquiler y devolución), por un valor módulo de cada barco (obtenido simplemente
multiplicando por 10 los metros de eslora).

En los barcos de tipo especial el módulo de cada barco se calcula sacando el módulo normal y
sumándole el atributo particular de cada barco. 

// sub clases / barco padre
En los veleros se suma el número de mástiles, 

en los barcos a motor se le suma la potencia en CV y

en los yates se suma la potencia en CV y el número de camarotes.


Utilizando la herencia de forma apropiada, deberemos programar en Java, las clases y los
métodos necesarios que permitan al usuario elegir el barco que quiera alquilar y mostrarle el
precio final de su alquiler.
 */
package herencia;

import Entidad.e01_Alquiler;
import Entidad.e01_Barco;
import Entidad.e01_BarcoMotor;
import Entidad.e01_Velero;
import Entidad.e01_Yate;
import Servicio.e01_AlquilerServicio;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class e01 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        e01_Velero velero = new e01_Velero();
        e01_BarcoMotor barcoMotor = new e01_BarcoMotor();
        e01_Yate yate = new e01_Yate();

        velero.crearBarco();

        barcoMotor.crearBarco();

        yate.crearBarco();

        // falta crear una lista donde agregue los barcos y despues le asigno a cada alquiler un barco.
        ArrayList<e01_Barco> barcoList = new ArrayList<e01_Barco>();
        barcoList.add(velero);
        barcoList.add(barcoMotor);
        barcoList.add(yate);

        e01_AlquilerServicio as = new e01_AlquilerServicio();

        ArrayList<e01_Alquiler> listaAlquileres = new ArrayList<e01_Alquiler>();
        /*
        for (int i = 0; i < barcoList.size(); i++) {
            System.out.println("La cantidad de barcos para alquilar son: " + barcoList.size());
        }
         */
        int cont = 0;

        for (e01_Barco aux : barcoList) {
            System.out.println("barco n° " + cont + " " + aux);  // veo los barcos disponibles
            cont++;
        }

        Iterator<e01_Barco> itBarco = barcoList.iterator();
        while (itBarco.hasNext()) {
            e01_Barco auxBarco = itBarco.next();
            e01_Alquiler alquiler = as.inicioAlquiler(auxBarco);
            listaAlquileres.add(alquiler);
            System.out.println("----------");
        }

        for (e01_Alquiler listaAlquilere : listaAlquileres) {
            System.out.println(listaAlquilere);

        }


        /*
        falta crear un metodo para que se generen barcos hasta que decida que se generen, despues ya esta creado que el alquiler se cree para cada barco,}
        pero falta opnerle una condicion de si quiere seguir alquilando barcos o prefiere dejar los barcos restantes.
        
         */
    }

}

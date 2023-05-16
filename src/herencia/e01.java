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
        ArrayList<e01_Barco> barcoList = new ArrayList<e01_Barco>();
        boolean bandera = false;
        do {
            System.out.println("---- Menu ----");
            System.out.println("1- Cargar Barco Velero");
            System.out.println("2- Cargar Barco a Motor");
            System.out.println("3- Cargar Barco Yate");
            System.out.println("4- Salir de la carga de barcos.");
            int opBarc = leer.nextInt();
            switch (opBarc) {
                case 1:
                    e01_Barco velero = new e01_Velero();
                    velero.crearBarco();
                    barcoList.add(velero);
                    break;
                case 2:
                    e01_Barco barcoMotor = new e01_BarcoMotor();
                    barcoMotor.crearBarco();
                    barcoList.add(barcoMotor);
                    break;
                case 3:
                    e01_Barco yate = new e01_Yate();
                    yate.crearBarco();
                    barcoList.add(yate);
                    break;
                case 4:
                    bandera = true;

            }
        } while (bandera == false);

        e01_AlquilerServicio as = new e01_AlquilerServicio();

        ArrayList<e01_Alquiler> listaAlquileres = new ArrayList<e01_Alquiler>();
        boolean salida = false;

        do {
            int cont = 0;

            for (e01_Barco aux : barcoList) {
                System.out.println("barco n° " + cont + " " + aux);  // veo los barcos disponibles
                cont++;
            }

            System.out.println("La cantidad de barcos para alquilar son: " + barcoList.size());

            System.out.println("Ingrese el numero del barco que quiere alquilar.");
            int eleccion = leer.nextInt();

            Iterator<e01_Barco> itBarco = barcoList.iterator();
            cont = 0;
            do {
                e01_Barco auxBarco = itBarco.next(); // guardo cada barco de la lista para utilizarlo
                if (cont == eleccion) {
                    e01_Alquiler alquiler = as.inicioAlquiler(auxBarco); // mando el barco por parametro en caso q sea el que eligio el usuario
                    listaAlquileres.add(alquiler); // lo agrego a la lista de barcosAlquilados
                    // saco al barco de la lista de opciones
                    itBarco.remove();
                }
                cont++;
                System.out.println("----------");
            } while (itBarco.hasNext()); // se repite mientras haya barcos 

            if (barcoList.isEmpty()) {  // repito todo hasta que no queden barco para alquilar
                System.out.println("No quedan mas barcos para alquilar.");
                salida = true;
            }
        } while (salida == false);

        for (e01_Alquiler listaAlquilere : listaAlquileres) {
            System.out.println(listaAlquilere);

        }


        /*
        falta crear un metodo para que se generen barcos hasta que decida que se generen, despues ya esta creado que el alquiler se cree para cada barco,}
        pero falta opnerle una condicion de si quiere seguir alquilando barcos o prefiere dejar los barcos restantes.
        
         */
    }

}

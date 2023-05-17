/*
 Crear una superclase llamada Edificio con los siguientes atributos: ancho, alto y largo. La clase
edificio tendrá como métodos:
• Método calcularSuperficie(): calcula la superficie del edificio.
• Método calcularVolumen(): calcula el volumen del edifico.
Estos métodos serán abstractos y los implementarán las siguientes clases:


• Clase Polideportivo con su nombre y tipo de instalación que puede ser Techado o
Abierto, esta clase implementará los dos métodos abstractos y los atributos del padre.

• Clase EdificioDeOficinas con sus atributos número de oficinas, cantidad de personas
por oficina y número de pisos. Esta clase implementará los dos métodos abstractos y
los atributos del padre.

De esta clase nos interesa saber cuántas personas pueden trabajar en todo el edificio, el
usuario dirá cuántas personas entran en cada oficina, cuantas oficinas y el número de piso
(suponiendo que en cada piso hay una oficina). Crear el método cantPersonas(), que muestre
cuantas personas entrarían en un piso y cuantas en todo el edificio.


Por último, en el main vamos a crear un ArrayList de tipo Edificio. El ArrayList debe contener
dos polideportivos y dos edificios de oficinas. Luego, recorrer este array y ejecutar los
métodos calcularSuperficie y calcularVolumen en cada Edificio. Se deberá mostrar la
superficie y el volumen de cada edificio.
Además de esto, para la clase Polideportivo nos interesa saber cuántos polideportivos son
techados y cuantos abiertos. Y para la clase EdificioDeOficinas deberemos llamar al método
cantPersonas() y mostrar los resultados de cada edificio de oficinas.
 */
package herencia;

import Entidad.e02_Edificio;
import Entidad.e02_EdificioDeOficina;
import Entidad.e02_Polideportivo;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class e02 {

    /*
    Por último, en el main vamos a crear un ArrayList de tipo Edificio. El ArrayList debe contener
dos polideportivos y dos edificios de oficinas. Luego, recorrer este array y ejecutar los
métodos calcularSuperficie y calcularVolumen en cada Edificio. Se deberá mostrar la
superficie y el volumen de cada edificio.
Además de esto, para la clase Polideportivo nos interesa saber cuántos polideportivos son
techados y cuantos abiertos. Y para la clase EdificioDeOficinas deberemos llamar al método
cantPersonas() y mostrar los resultados de cada edificio de oficinas.
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        ArrayList<e02_Edificio> edificiosList = new ArrayList<>();
        boolean bandera = false;
        do {
            System.out.println("--- MENU ---");
            System.out.println("1- Cargar Polideportivo");
            System.out.println("2- Cargar Edficio de oficinas");
            System.out.println("3- salir.");
            int opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    e02_Polideportivo poli1 = new e02_Polideportivo();
                    poli1.crearPoli();
                    edificiosList.add(poli1);
                    break;
                case 2:
                    e02_EdificioDeOficina oficina1 = new e02_EdificioDeOficina();
                    oficina1.crearOficina();
                    edificiosList.add(oficina1);
                    break;
                case 3:
                    bandera = true;

            }
        } while (bandera == false);

        int techo = 0;
        int abierto = 0;
        for (e02_Edificio edificio : edificiosList) {

            if (edificio instanceof e02_Polideportivo) {
                e02_Polideportivo aux = (e02_Polideportivo) edificio;
                System.out.println(edificio);
                System.out.println("La superficie es: " + edificio.calcularSuperficie());
                System.out.println("El volumen es: " + edificio.calcularVolumen());
                if (aux.isTecho()) {
                    techo++;
                } else {
                    abierto++;
                }
            }

            if (edificio instanceof e02_EdificioDeOficina) {
                e02_EdificioDeOficina aux = (e02_EdificioDeOficina) edificio;
                System.out.println(edificio);
                System.out.println("La superficie es: " + edificio.calcularSuperficie());
                System.out.println("El volumen es: " + edificio.calcularVolumen());
                aux.cantPersonas();

            }

        }
        System.out.println("La cantidad de polideportivos con techo son: " + techo + " y la cantidad con techo abierto son: " + abierto);

    }

}

/*
Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.
La clase Animal tendrá como atributos el nombre, alimento, edad y raza del Animal.
Crear un método en la clase Animal a través del cual cada clase hija deberá mostrar luego un
mensaje por pantalla informando de que se alimenta. Generar una clase Main que realice lo
siguiente:
 */
package herencia;

import Entidad.ej1_Animal;
import Entidad.ej1_Caballo;
import Entidad.ej1_Gato;
import Entidad.ej1_Perro;
import java.util.ArrayList;

public class ej1 {

    public static void main(String[] args) {
ej1_Animal perro1 = new ej1_Perro("Stich", "Carnivoro", 15, "Doberman");
ej1_Animal perro2 = new ej1_Perro("Teddy", "Croquetas", 10, "chihuahua");
ej1_Animal gato1= new ej1_Gato("Pelusa", "Galletas", 15, "Siames");
ej1_Animal caballo1= new ej1_Caballo("Spark", "Pasto", 25, "Fino");

// voy a crear un arraylist de animal. para que me recorra toda los objetos

ArrayList<ej1_Animal> animales = new ArrayList<ej1_Animal>();

animales.add(perro1);
animales.add(perro2);
animales.add(gato1);
animales.add(caballo1);
        for (ej1_Animal aux : animales) {
           aux.Alimentarse();
        }


    }
    
}

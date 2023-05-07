/*
EJERCICIO ANIMAL
Vamos a crear una clase Animal que tenga un método hacerRuido() que devuelva un saludo
“Hola”. Luego haremos clase Perro y clase Gato que extiendan de Animal y sobreescriban el
método hacerRuido() con el ruido que corresponda a cada uno. Luego, en el main vamos a crear
un ArrayList de animales y los siguientes animales
Animal a = new Animal();
Animal b = new Perro();
Animal c = new Gato();
Agregaremos a la lista a cada uno y luego, con un for each, recorreremos la lista llamando al
método hacerRuido() de cada ítem.
 */
package herencia;

import Entidad.teoriaAnimal;
import Entidad.teoriaGato;
import Entidad.teoriaPerro;
import java.util.ArrayList;

public class teoria01 {

    
    public static void main(String[] args) {
  //teoriaAnimal a = new teoriaAnimal();
   teoriaAnimal b = new teoriaPerro();
   teoriaAnimal c = new teoriaGato();
   ArrayList<teoriaAnimal> animales = new ArrayList<teoriaAnimal>();
  // animales.add(a);
   animales.add(b);
   animales.add(c);
        for (teoriaAnimal aux : animales) {
            aux.hacerRuido();
            aux.nombreClase();
            System.out.println(" ");
        }
   
        
      
        
        
        
        
        
    }
    
    
    /*
    Vamos a crear una interfaz con un método abstracto. Luego desde el main intentaremos instanciar
un objeto a partir de la interfaz
    */
    
    
    
    
    
}

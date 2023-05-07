
package Entidad;


public class ej1_Caballo extends ej1_Animal{

    public ej1_Caballo(String nombre, String alimento, int edad, String raza) {
        super(nombre, alimento, edad, raza);
    }
    
    
    
@Override
public void Alimentarse(){
            System.out.println("El " + raza + " de nombre " + nombre + " se alimenta de " + alimento );

}
}

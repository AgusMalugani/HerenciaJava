
package Entidad;
/*
 Clase Polideportivo con su nombre y tipo de instalación que puede ser Techado o
Abierto, esta clase implementará los dos métodos abstractos y los atributos del padre.

*/
public class e02_Polideportivo extends e02_Edificio {
    private String nombre;
    private boolean techo; // si tiene es true

    public e02_Polideportivo() {
    }

    public e02_Polideportivo(String nombre, boolean techo, int ancho, int alto, int largo) {
        super(ancho, alto, largo);
        this.nombre = nombre;
        this.techo = techo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isTecho() {
        return techo;
    }

    public void setTecho(boolean techo) {
        this.techo = techo;
    }

    @Override
    public String toString() {
        return "e02_Polideportivo{" + "nombre=" + nombre + ", techo=" + techo + '}';
    }

    
   
    
    
    @Override
    public void calcularSuperficie() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void calcularVolumen() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}


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
    public int getAncho() {
        return ancho;
    }

    @Override
    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    @Override
    public int getAlto() {
        return alto;
    }

    @Override
    public void setAlto(int alto) {
        this.alto = alto;
    }

    @Override
    public int getLargo() {
        return largo;
    }

    @Override
    public void setLargo(int largo) {
        this.largo = largo;
    }
    

    @Override
    public String toString() {
        return "e02_Polideportivo{" + "nombre=" + nombre + ", techo=" + techo + '}';
    }

    
   
    
    
    @Override
    public int calcularSuperficie() {
//largo x ancho

int superficie = getLargo() * getAncho();
return superficie;

    }

    @Override
    public int calcularVolumen() {
//multiplicación de la altura por el ancho y por el largo.

        int volumen = getAlto()*getAncho()*getLargo();
return volumen;
    }
    
    public e02_Polideportivo crearPoli(){
        System.out.println("Ingrese el nombre del Polideportivo");
        setNombre("POLIDEPORTIVOOO");
        System.out.println("Es techado ? s/n");
        /*
        String resp = leer.next();
        if(resp.equalsIgnoreCase("s")){
        setTecho(true);
        }else { setTecho(False);}
        */
        setTecho(true);
        
       System.out.println("Ingrese el Largo del edificio");
        setLargo(50); // desp cambiarlo con scanner
System.out.println("Ingrese el ancho del edificio");
        setAncho(100);
        System.out.println("Ingrese la altura del edificio");
        setAlto(80);
        return new e02_Polideportivo(nombre, techo, ancho, alto, largo);
    }
    
    
    
    
}

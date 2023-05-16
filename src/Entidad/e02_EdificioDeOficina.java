/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 • Clase EdificioDeOficinas con sus atributos número de oficinas, cantidad de personas
por oficina y número de pisos. Esta clase implementará los dos métodos abstractos y
los atributos del padre.

 */
public class e02_EdificioDeOficina extends e02_Edificio {
    private int numOficinas;
    private int personasPorOficina;
    private int numPisos;

    public e02_EdificioDeOficina() {
    }

    public e02_EdificioDeOficina(int numOficinas, int personasPorOficina, int numPisos, int ancho, int alto, int largo) {
        super(ancho, alto, largo);
        this.numOficinas = numOficinas;
        this.personasPorOficina = personasPorOficina;
        this.numPisos = numPisos;
    }

    public int getNumOficinas() {
        return numOficinas;
    }

    public void setNumOficinas(int numOficinas) {
        this.numOficinas = numOficinas;
    }

    public int getPersonasPorOficina() {
        return personasPorOficina;
    }

    public void setPersonasPorOficina(int personasPorOficina) {
        this.personasPorOficina = personasPorOficina;
    }

    public int getNumPisos() {
        return numPisos;
    }

    public void setNumPisos(int numPisos) {
        this.numPisos = numPisos;
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
        return "e02_EdificioDeOficina{" + "numOficinas=" + numOficinas + ", personasPorOficina=" + personasPorOficina + ", numPisos=" + numPisos + '}';
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
    /*
              private int numOficinas;
    private int personasPorOficina;
    private int numPisos;
            */
        
       System.out.println("Ingrese el Largo del edificio");
        setLargo(50); // desp cambiarlo con scanner
System.out.println("Ingrese el ancho del edificio");
        setAncho(100);
        System.out.println("Ingrese la altura del edificio");
        setAlto(80);
        return new e02_Polideportivo(nombre, techo, ancho, alto, largo);
    }
    
    
    
    
}

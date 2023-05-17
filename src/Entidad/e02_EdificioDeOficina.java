/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/**
 * • Clase EdificioDeOficinas con sus atributos número de oficinas, cantidad de
 * personas por oficina y número de pisos. Esta clase implementará los dos
 * métodos abstractos y los atributos del padre.
 *
 */
public class e02_EdificioDeOficina extends e02_Edificio {

    private int numOficinas;
    private int personasPorOficina;
    private int numPisos;
    Scanner leer = new Scanner(System.in);

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
        return super.toString() + "e02_EdificioDeOficina{" + "numOficinas=" + numOficinas + ", personasPorOficina=" + personasPorOficina + ", numPisos=" + numPisos + '}';
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

        int volumen = getAlto() * getAncho() * getLargo();
        return volumen;
    }

    public e02_EdificioDeOficina crearOficina() {
        /*
            
              private int numOficinas;
    private int personasPorOficina;
    private int numPisos;
         */
        System.out.println("----- Edificio con oficinas -----");
        System.out.println("Ingrese el Largo del edificio");
        setLargo(leer.nextInt()); // desp cambiarlo con scanner
        System.out.println("Ingrese el ancho del edificio");
        setAncho(leer.nextInt());
        System.out.println("Ingrese la altura del edificio");
        setAlto(leer.nextInt());
        System.out.println("Ingrese el numero de pisos, en cada piso hay una oficina");
        setNumPisos(leer.nextInt());
        setNumOficinas(getNumPisos());
        System.out.println("Cuantas personas entran en 1 piso ?");
        setPersonasPorOficina(leer.nextInt());// cantidad por piso
        // int cantidadTotal = cantPersonas();
        return new e02_EdificioDeOficina(numOficinas, personasPorOficina, numPisos, ancho, alto, largo);
    }

    /*
        Crear el método cantPersonas(), que muestre
cuantas personas entrarían en un piso y cuantas en todo el edificio.
     */
    public int cantPersonas() {

        int cantidadTotalPersonas = getPersonasPorOficina() * getNumPisos(); // cantidad en todo el edificio
        System.out.println("En el edificio entra un total de : " + cantidadTotalPersonas + " personas");
        return cantidadTotalPersonas;
    }

}

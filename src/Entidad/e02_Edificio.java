/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 * Crear una superclase llamada Edificio con los siguientes atributos: ancho,
 * alto y largo. La clase edificio tendrá como métodos: • Método
 * calcularSuperficie(): calcula la superficie del edificio. • Método
 * calcularVolumen(): calcula el volumen del edifico. Estos métodos serán
 * abstractos y los implementarán las siguientes clases:
 */
public abstract class e02_Edificio {

    protected int ancho;
    protected int alto;
    protected int largo;

    public e02_Edificio() {
    }

    public e02_Edificio(int ancho, int alto, int largo) {
        this.ancho = ancho;
        this.alto = alto;
        this.largo = largo;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public abstract int calcularSuperficie();

    public abstract int calcularVolumen();

    @Override
    public String toString() {
        return "e02_Edificio{" + "ancho=" + ancho + ", alto=" + alto + "largo" + largo + '}';
    }

}

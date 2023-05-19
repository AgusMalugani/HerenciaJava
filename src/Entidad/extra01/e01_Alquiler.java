/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad.extra01;

import java.util.Date;

/**
 *
 * @author Usuario
 */
public class e01_Alquiler {

    protected String nombre;
    protected int documento;
    protected Date fechaAlq;
    protected Date fechaDev;
    protected int posicionAmarre;
    protected e01_Barco barco; // vamos a relacionar 1 barco con 1 alquiler.

    public e01_Alquiler(String nombre, int documento, Date fechaAlq, Date fechaDev, int posicionAmarre, e01_Barco barco) {
        this.nombre = nombre;
        this.documento = documento;
        this.fechaAlq = fechaAlq;
        this.fechaDev = fechaDev;
        this.posicionAmarre = posicionAmarre;
        this.barco = barco;
    }

    public e01_Alquiler() {

    }

    public Date getFechaAlq() {
        return fechaAlq;
    }

    public void setFechaAlq(Date fechaAlq) {
        this.fechaAlq = fechaAlq;
    }

    public Date getFechaDev() {
        return fechaDev;
    }

    public void setFechaDev(Date fechaDev) {
        this.fechaDev = fechaDev;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public int getPosicionAmarre() {
        return posicionAmarre;
    }

    public void setPosicionAmarre(int posicionAmarre) {
        this.posicionAmarre = posicionAmarre;
    }

    public e01_Barco getBarco() {
        return barco;
    }

    public void setBarco(e01_Barco barco) {
        this.barco = barco;
    }

    @Override
    public String toString() {
        return "e01_Alquiler{" + "nombre=" + nombre + ", documento=" + documento + ", fechaAlq=" + fechaAlq + ", fechaDev=" + fechaDev + ", posicionAmarre=" + posicionAmarre + ", barco=" + barco + '}';
    }

}

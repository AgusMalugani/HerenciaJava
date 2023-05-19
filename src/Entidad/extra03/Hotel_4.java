/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad.extra03;

/**
• Hotel **** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos,  *Gimnasio,
*Nombre del Restaurante, *Capacidad del Restaurante, Precio de las Habitaciones.
 */
public class Hotel_4 extends Hotel {
    protected String gim;
    protected String nomRest;
    protected int capacidadRest;

    public Hotel_4() {
    }

    public Hotel_4(String gim, String nomRest, int capacidadRest, int cantHab, int numCamas, int cantPisos, int precioHab) {
        super(cantHab, numCamas, cantPisos, precioHab);
        this.gim = gim;
        this.nomRest = nomRest;
        this.capacidadRest = capacidadRest;
    }

    public String getGim() {
        return gim;
    }

    public void setGim(String gim) {
        this.gim = gim;
    }

    public String getNomRest() {
        return nomRest;
    }

    public void setNomRest(String nomRest) {
        this.nomRest = nomRest;
    }

    public int getCapacidadRest() {
        return capacidadRest;
    }

    public void setCapacidadRest(int capacidadRest) {
        this.capacidadRest = capacidadRest;
    }

    @Override
    public int getCantHab() {
        return cantHab;
    }

    @Override
    public void setCantHab(int cantHab) {
        this.cantHab = cantHab;
    }

    @Override
    public int getNumCamas() {
        return numCamas;
    }

    @Override
    public void setNumCamas(int numCamas) {
        this.numCamas = numCamas;
    }

    @Override
    public int getCantPisos() {
        return cantPisos;
    }

    @Override
    public void setCantPisos(int cantPisos) {
        this.cantPisos = cantPisos;
    }

    @Override
    public int getPrecioHab() {
        return precioHab;
    }

    @Override
    public void setPrecioHab(int precioHab) {
        this.precioHab = precioHab;
    }

    @Override
    public String toString() {
        return super.toString()+"Hotel_4{" + "gim=" + gim + ", nomRest=" + nomRest + ", capacidadRest=" + capacidadRest + '}';
    }
    
    
    
    
}

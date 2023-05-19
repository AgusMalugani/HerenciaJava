/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad.extra03;

/**
• Hotel ***** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio,
Nombre del Restaurante, Capacidad del Restaurante, *Cantidad Salones de Conferencia, 
    *Cantidad de Suites, *Cantidad de Limosinas, Precio de las Habitaciones.
 */
public class Hotel_5 extends Hotel_4{
    private int cantSalones;
    private int cantSuite;
    private int cantLimusinas;

    public Hotel_5() {
    }

    public Hotel_5(int cantSalones, int cantSuite, int cantLimusinas, String gim, String nomRest, int capacidadRest, int cantHab, int numCamas, int cantPisos, int precioHab) {
        super(gim, nomRest, capacidadRest, cantHab, numCamas, cantPisos, precioHab);
        this.cantSalones = cantSalones;
        this.cantSuite = cantSuite;
        this.cantLimusinas = cantLimusinas;
    }

    public int getCantSalones() {
        return cantSalones;
    }

    public void setCantSalones(int cantSalones) {
        this.cantSalones = cantSalones;
    }

    public int getCantSuite() {
        return cantSuite;
    }

    public void setCantSuite(int cantSuite) {
        this.cantSuite = cantSuite;
    }

    public int getCantLimusinas() {
        return cantLimusinas;
    }

    public void setCantLimusinas(int cantLimusinas) {
        this.cantLimusinas = cantLimusinas;
    }

    @Override
    public String getGim() {
        return gim;
    }

    @Override
    public void setGim(String gim) {
        this.gim = gim;
    }

    @Override
    public String getNomRest() {
        return nomRest;
    }

    @Override
    public void setNomRest(String nomRest) {
        this.nomRest = nomRest;
    }

    @Override
    public int getCapacidadRest() {
        return capacidadRest;
    }

    @Override
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
        return super.toString() + "Hotel_5{" + "cantSalones=" + cantSalones + ", cantSuite=" + cantSuite + ", cantLimusinas=" + cantLimusinas + '}';
    }
    
    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad.extra03;

/*
Los Hoteles tienen como atributos: Cantidad de Habitaciones, Número de Camas, Cantidad de
Pisos, Precio de Habitaciones.
  */
public class Hotel {
    protected int cantHab;
    protected int numCamas;
    protected int cantPisos;
    protected int precioHab;

    public Hotel() {
    }

    public Hotel(int cantHab, int numCamas, int cantPisos, int precioHab) {
        this.cantHab = cantHab;
        this.numCamas = numCamas;
        this.cantPisos = cantPisos;
        this.precioHab = precioHab;
    }

    public int getCantHab() {
        return cantHab;
    }

    public void setCantHab(int cantHab) {
        this.cantHab = cantHab;
    }

    public int getNumCamas() {
        return numCamas;
    }

    public void setNumCamas(int numCamas) {
        this.numCamas = numCamas;
    }

    public int getCantPisos() {
        return cantPisos;
    }

    public void setCantPisos(int cantPisos) {
        this.cantPisos = cantPisos;
    }

    public int getPrecioHab() {
        return precioHab;
    }

    public void setPrecioHab(int precioHab) {
        this.precioHab = precioHab;
    }

    @Override
    public String toString() {
        return "Hotel{" + "cantHab=" + cantHab + ", numCamas=" + numCamas + ", cantPisos=" + cantPisos + ", precioHab=" + precioHab + '}';
    }
    
    
    
    
    
    
}

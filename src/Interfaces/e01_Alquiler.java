/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Entidad.e01_Barco;

/**
 En un puerto se alquilan amarres para barcos de distinto tipo. Para cada Alquiler se guarda: el
nombre, documento del cliente, la fecha de alquiler, fecha de devolución, la posición del
amarre y el barco que lo ocupará.  
 */
public abstract class e01_Alquiler {
   protected String nombre;
   protected int documento;
   protected int fechaAlq;
   protected int fechaDev;
   protected int posicionAmarre;
   protected e01_Barco barco; // vamos a relacionar 1 barco con 1 alquiler.
    
    
}

package Servicio;

import Entidad.e01_Alquiler;
import Entidad.e01_Barco;
import java.util.ArrayList;

import java.util.Date;
import java.util.Scanner;

public class e01_AlquilerServicio {
    
    Scanner leer = new Scanner(System.in);

//    public ArrayList barcos(ArrayList barcoList){
    //      ArrayList // queria crear lo del main ak
    // }
    public e01_Alquiler inicioAlquiler(e01_Barco barco) {
        e01_Alquiler al = new e01_Alquiler();
        //String nombre, int documento, int fechaAlq, int fechaDev, int posicionAmarre, e01_Barco barco
        System.out.println("Ingrese el nombre");
        al.setNombre(leer.next());
        System.out.println("Ingrese su documento");
        al.setDocumento(leer.nextInt());

        // le dare la fecha actual con calendar
        Date inicio = new Date(); // convierto el calendareio a Date.
        System.out.println("Su alquiler comienza : " + inicio);
        
        al.setFechaAlq(inicio);
        
        int mes;
        int dia;
        System.out.println("Ingrese el mes de la devolucion");
        mes = leer.nextInt();
        System.out.println("Ingrese el dia de la devolucion");
        dia = leer.nextInt();
        
        Date fin = new Date(2023 - 1900, mes - 1, dia);
        
        al.setFechaDev(fin);
        al.setBarco(barco);
        
        long Diferencia = (al.getFechaDev().getTime() - al.getFechaAlq().getTime()) / (24 * 60 * 60 * 1000);
        System.out.println("La cantidad de dias de su alquiler es:  " + Diferencia);
        int modulo = (int) ((al.getBarco().getEslora() * 10) * Diferencia); // multiplico eslora x10

        System.out.println("EL PRECIO FINAL DE SU ALQUILER ES : $" + modulo);
        al.setPosicionAmarre((int) (Math.random() * 100 + 1));
        
        return al;
    }

    /*
          Un alquiler se calcula multiplicando el número de días de ocupación (calculado con la fecha de
alquiler y devolución), por un valor módulo de cada barco (obtenido simplemente
multiplicando por 10 los metros de eslora)
     */
}

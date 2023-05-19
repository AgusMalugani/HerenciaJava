/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad.extra01;

import java.util.Scanner;

/**
 * Número de mástiles para veleros.
 */
public class e01_Velero extends e01_Barco {

    private int mastiles;
    Scanner leer = new Scanner(System.in);

    public e01_Velero() {
    }

    public e01_Velero(int mastiles) {
        this.mastiles = mastiles;
    }

    public e01_Velero(int mastiles, String matricula, int eslora, int añoFabr) {
        super(matricula, eslora, añoFabr);
        this.mastiles = mastiles;
    }

    public int getMastiles() {
        return mastiles;
    }

    public void setMastiles(int mastiles) {
        this.mastiles = mastiles;
    }

    @Override
    public void crearBarco() {
        super.crearBarco();
        System.out.println("Ingrese cuantos mastiles tiene el velero");
        this.mastiles = leer.nextInt();
    }

    @Override
    public String toString() {
        return super.toString() + "e01_Velero{" + "mastiles=" + mastiles + '}';
    }

}

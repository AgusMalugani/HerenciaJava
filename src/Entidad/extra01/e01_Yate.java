/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad.extra01;

/**
 *
 * @author Usuario
 */
public class e01_Yate extends e01_BarcoMotor {

    private int numCamarotes;

    public e01_Yate() {
    }

    public e01_Yate(int numCamarotes, int potenciaCV, String matricula, int eslora, int añoFabr) {
        super(potenciaCV, matricula, eslora, añoFabr);
        this.numCamarotes = numCamarotes;
    }

    public int getNumCamarotes() {
        return numCamarotes;
    }

    public void setNumCamarotes(int numCamarotes) {
        this.numCamarotes = numCamarotes;
    }

    @Override
    public void crearBarco() {
        super.crearBarco();
        System.out.println("Ingrese cuantos camarotes tiene el yate");
        this.numCamarotes = leer.nextInt();
    }

    @Override
    public String toString() {
        return super.toString() + "e01_Yate{" + "numCamarotes=" + numCamarotes + '}';
    }

}

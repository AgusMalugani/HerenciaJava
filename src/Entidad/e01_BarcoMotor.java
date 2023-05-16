/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class e01_BarcoMotor extends e01_Barco {

    Scanner leer = new Scanner(System.in);
    protected int potenciaCV;

    public e01_BarcoMotor() {
    }

    public e01_BarcoMotor(int potenciaCV, String matricula, int eslora, int añoFabr) {
        super(matricula, eslora, añoFabr);
        this.potenciaCV = potenciaCV;
    }

    public int getPotenciaCV() {
        return potenciaCV;
    }

    public void setPotenciaCV(int potenciaCV) {
        this.potenciaCV = potenciaCV;
    }

    @Override
    public void crearBarco() {
        super.crearBarco();
        System.out.println("Ingrese la potencia del barco");
        this.potenciaCV = leer.nextInt();
    }

    @Override
    public String toString() {
        return super.toString() + "e01_BarcoMotor{" + "potenciaCV=" + potenciaCV + '}';
    }

}

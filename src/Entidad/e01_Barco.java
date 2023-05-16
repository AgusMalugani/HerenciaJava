/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/**
 * Barco se caracteriza por: su matrícula, su eslora en metros y año de
 * fabricación.
 */
public class e01_Barco {

    protected String matricula;
    protected int eslora;
    protected int añoFabr;
    private Scanner leer = new Scanner(System.in);

    public e01_Barco() {
    }

    public e01_Barco(String matricula, int eslora, int añoFabr) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.añoFabr = añoFabr;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getEslora() {
        return eslora;
    }

    public void setEslora(int eslora) {
        this.eslora = eslora;
    }

    public int getAñoFabr() {
        return añoFabr;
    }

    public void setAñoFabr(int añoFabr) {
        this.añoFabr = añoFabr;
    }

    public void crearBarco() {
        System.out.println("--- Creacion Barco ---");
        System.out.println("Ingrese la matricula");
        this.matricula = leer.next();
        System.out.println("Ingrese su eslora");
        this.eslora = leer.nextInt();
        System.out.println("Ingrese el año de fabricacion");
        this.añoFabr = leer.nextInt();

    }

    @Override
    public String toString() {
        return "e01_Barco{" + "matricula=" + matricula + ", eslora=" + eslora + ", a\u00f1oFabr=" + añoFabr + '}';
    }

}

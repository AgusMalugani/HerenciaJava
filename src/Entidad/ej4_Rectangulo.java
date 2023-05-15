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
public class ej4_Rectangulo implements ej4_calculosFormas{
    
    Scanner leer = new Scanner(System.in);
    
    
    private double base;
    private double altura;

    public ej4_Rectangulo() {
    }

    public ej4_Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    

    @Override
    public double area() {
        System.out.println("Ingrese la base del rectangulo");
        this.base = leer.nextDouble();
        System.out.println("Ingrese la altura");
        this.altura = leer.nextDouble();
        
        double area = base + altura;
        System.out.println("El area del rectangulo es " + area);
        return area;


    }
//Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2.
    @Override
    public double perimetro() {
        double perimetro = (base + altura ) *2;
        System.out.println("El perimetro del rectangulo es: " + perimetro);
return perimetro;
    }
    
    
}

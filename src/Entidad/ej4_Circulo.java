
package Entidad;

import java.util.Scanner;

/**
 *
Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.
* 
* El diámetro mide el doble del radio
 */
public class ej4_Circulo implements ej4_calculosFormas {
    
    Scanner leer = new Scanner(System.in);
    
    
    
    private int radio;
    private int diametro;

    public ej4_Circulo() {
    }

    public ej4_Circulo(int radio, int diametro) {
        this.radio = radio;
        this.diametro = diametro;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public int getDiametro() {
        return diametro;
    }

    public void setDiametro(int diametro) {
        this.diametro = diametro;
    }
    
    
    

    @Override
    public double area() {
        System.out.println("Ingrese el Radio del circulo.");
   this.radio= leer.nextInt();
    // pi x radio al cuadrado
    double area = PI* (Math.pow(radio, 2));
        System.out.println("El area del circulo es: " + area);
    return area;
        
    }

    @Override
    public double perimetro() {
// pi x diametro
double perimetro = PI * (getRadio()*2);

        System.out.println("El perimetro del circulo es : " + perimetro);
        return perimetro;

    }
    
}
